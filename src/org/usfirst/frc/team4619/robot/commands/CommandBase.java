package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.DriveBaseSubsys;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {

	public static OI oi;
	public static DriveBaseSubsys driveBase = new DriveBaseSubsys();
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		oi = new OI();
	}

	public CommandBase(String subsystem)
	{
		super(subsystem);
	}
	
	public CommandBase()
	{
		super();
	}

}
