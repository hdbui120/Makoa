package org.usfirst.frc.team4619.robot.subsystems;

import org.usfirst.frc.team4619.robot.commands.Flat;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearSub extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid solenoidValve;
	
	public GearSub()
	{
		
	}
	
	public GearSub(int pwc1, int pwc2)
	{
		solenoidValve = new DoubleSolenoid(pwc1, pwc2);
	}

	public void pistonForward()
	{
		if(solenoidValve.get() != DoubleSolenoid.Value.kForward)
		{
			solenoidValve.set(DoubleSolenoid.Value.kForward);
		}
		else
		{
			solenoidValve.set(DoubleSolenoid.Value.kOff);
		}
	}
	
	public void pistonBackward()
	{
		if(solenoidValve.get() != DoubleSolenoid.Value.kReverse)
		{
			solenoidValve.set(DoubleSolenoid.Value.kReverse);
		}
		else
		{
			solenoidValve.set(DoubleSolenoid.Value.kOff);
		}
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Flat());
    }
}

