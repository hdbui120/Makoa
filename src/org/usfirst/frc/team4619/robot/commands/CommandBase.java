package org.usfirst.frc.team4619.robot.commands;

import org.usfirst.frc.team4619.robot.OI;
import org.usfirst.frc.team4619.robot.subsystems.ClimbingSub;
import org.usfirst.frc.team4619.robot.subsystems.DriveBaseSubsys;
import org.usfirst.frc.team4619.robot.subsystems.GearSub;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {

	public static OI oi;
	public static DriveBaseSubsys driveBase = new DriveBaseSubsys();
	public static ClimbingSub climbMech = new ClimbingSub();
	public static GearSub gearMech = new GearSub();
	
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
