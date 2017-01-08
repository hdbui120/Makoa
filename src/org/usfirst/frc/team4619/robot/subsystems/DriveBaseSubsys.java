package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4619.robot.OI;

/**
 *
 */
public class DriveBaseSubsys extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController frontLeft;
	private SpeedController backLeft; 
	private SpeedController frontRight; 
	private SpeedController backRight; 
	
	OI xboxCon = new OI();
	
	private RobotDrive driveTrain = new RobotDrive(frontLeft, backLeft,
												   frontRight, backRight);	
	
	public DriveBaseSubsys()
	{		}
	
	public DriveBaseSubsys(SpeedController fl, SpeedController bl,
							SpeedController fr, SpeedController br)
	{
		frontLeft = fl;
		backLeft = bl;
		frontRight = fr;
		backRight = br;
	}
	
	public SpeedController getFL()
	{
		return frontLeft;
	}
	
	public SpeedController getFR()
	{
		return frontRight;
	}
	
	public SpeedController getBL()
	{
		return backLeft;
	}
	
	public SpeedController getBR()
	{
		return backRight;
	}
	
	public void arcadeDriv(double xAxis, double yAxis)
	{
		driveTrain.arcadeDrive(xAxis, yAxis, true);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        super.setDefaultCommand(new DriveJoystick());
    }
}

