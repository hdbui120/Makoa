package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBaseSubsys extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private VictorSP frontLeft;
	private VictorSP backLeft; 
	private VictorSP frontRight; 
	private VictorSP backRight; 
	
	public DriveBaseSubsys()
	{
		frontLeft = new VictorSP(RobotMap.frontLeftDrive);
		backLeft = new VictorSP(RobotMap.backLeftDrive);
		frontRight = new VictorSP(RobotMap.frontRightDrive);
		backRight = new VictorSP(RobotMap.backRightDrive);
		
		RobotDrive driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

