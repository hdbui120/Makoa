package org.usfirst.frc.team4619.robot.commands;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class StraightSeven extends CommandBase implements PIDOutput{

	double P;
	double I;
	double D;
	double errorTolerance = .2;
	double setPointAngle = 180;
	double distanceInputMin = 0;
	double distanceInputMax = 8;
	double setDistance = 7;
	double currentDistance;
	double output;
	AHRS ahrs;
	PIDController driveController;
	
	protected void Initialize()
	{
		P = 2;
		I = .2;
		D = 3;
		ahrs = new AHRS(I2C.Port.kMXP);
		driveController = new PIDController(P,I,D,ahrs,this);
		driveController.setInputRange(distanceInputMin, distanceInputMax);
		driveController.setOutputRange(-1, 1);
		driveController.setSetpoint(setDistance);
	}
	
	public double getCurrentDist()
	{
		currentDistance = ahrs.getDisplacementY()*3.28084;
		return currentDistance;
	}
	
	@Override
	protected void execute() 
	{
		driveController.enable();
		SmartDashboard.putBoolean("the PID control mode is: ", driveController.isEnabled());
		driveBase.getFL().set(output);
		driveBase.getBL().set(output);
		driveBase.getFR().set(output);
		driveBase.getBR().set(output);
	}

	@Override
	protected boolean isFinished() 
	{
		// TODO Auto-generated method stub
		SmartDashboard.putNumber("Current Distance is(ft): ", currentDistance);
		return setDistance - currentDistance < .3;
	}

	@Override
	protected void end() 
	{
		// TODO Auto-generated method stub
		driveController.disable();
	}

	@Override
	protected void interrupted()
	{
		// TODO Auto-generated method stub
		driveController.disable();
	}

	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		this.output = output;
	}

}
