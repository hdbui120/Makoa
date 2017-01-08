package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.NotActivate;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbingSub extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	SpeedController frontMotor;
	SpeedController backMotor;
	DoubleSolenoid lockRight;
	DoubleSolenoid lockLeft;
	
	public ClimbingSub()
	{};
	
	public ClimbingSub(SpeedController fm, SpeedController bm,
						DoubleSolenoid right, DoubleSolenoid left)
	{
		this.frontMotor = fm;
		this.backMotor = bm;
		this.lockRight = right;
		this.lockLeft = left;
	}

	public void spinCont()
	{
		frontMotor.set(-.3);
		backMotor.set(.3);
	}
	
	public void notSpin()
	{
		frontMotor.set(0);
		backMotor.set(0);
	}
	
	public void pistonRightForward()
	{
		if(lockRight.get() != DoubleSolenoid.Value.kForward)
		{
			lockRight.set(DoubleSolenoid.Value.kForward);
		}
		else
		{
			lockRight.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void pistonLeftForward()
	{
		if(lockLeft.get() != DoubleSolenoid.Value.kForward)
		{
			lockLeft.set(DoubleSolenoid.Value.kForward);
		}
		else
		{
			lockLeft.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void pistonLeftBackward()
	{
		if(lockLeft.get() != DoubleSolenoid.Value.kReverse)
		{
			lockLeft.set(DoubleSolenoid.Value.kReverse);
		}
		else
		{
			lockLeft.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void pistonRightBackward()
	{
		if(lockRight.get() != DoubleSolenoid.Value.kReverse)
		{
			lockRight.set(DoubleSolenoid.Value.kReverse);
		}
		else
		{
			lockRight.set(DoubleSolenoid.Value.kOff);
		}
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new NotActivate());
    }
}

