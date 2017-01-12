package org.usfirst.frc.team4619.robot.commands;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Turn180 extends CommandBase implements PIDOutput {

	double P = 1.5;
	double I = .5;
	double D = 1;
	double F = .2;
	double errorTolerance = .2;
	double setPointAngle = 180;
	double gyroInputMin = -180;
	double gyroInputMax = 180;
	double output;
	AHRS ahrs;
	PIDController turnController;
	
	public Turn180()
	{
		requires(driveBase);
	}
	
	protected void Initialize()
	{
		ahrs = new AHRS(SPI.Port.kMXP);
		turnController = new PIDController(P, I, D, F, ahrs, this);
		turnController.setInputRange(gyroInputMin,gyroInputMax);
		turnController.setAbsoluteTolerance(errorTolerance);
		turnController.setOutputRange(-1,1);
		turnController.setSetpoint(setPointAngle);
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		turnController.enable();
		SmartDashboard.putBoolean("the PID control mode is: ", turnController.isEnabled());
		driveBase.getFL().set(output);
		driveBase.getBL().set(output);
		driveBase.getFR().set(output);
		driveBase.getBR().set(output);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return ahrs.getAngle()-setPointAngle < errorTolerance;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		turnController.disable();
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		turnController.disable();
	}

	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		this.output = output;		
	}

}
