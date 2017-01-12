package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoTest extends CommandGroup{

	public AutoTest()
	{
		addSequential(new StraightSeven());
		addSequential(new Turn180());
		addSequential(new StraightSeven());
		addSequential(new Turn180());
	}
	
}
