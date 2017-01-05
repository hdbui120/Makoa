package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

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
	
	public DriveBaseSubsys(SpeedController fl, SpeedController bl,
							SpeedController fr, SpeedController br)
	{
		frontLeft = fl;
		backLeft = bl;
		frontRight = fr;
		backRight = br;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

