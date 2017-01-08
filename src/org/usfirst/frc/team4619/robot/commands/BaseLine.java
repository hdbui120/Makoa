package org.usfirst.frc.team4619.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class BaseLine extends CommandBase{

	public BaseLine()
	{
		requires(driveBase);
		setTimeout(3);
	}
	
	public void checkTime()
	{
		System.out.println(timeSinceInitialized());
		Timer.delay(.9);
	}
	
	protected void initialize()
	{
		
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		driveBase.getBL().set(.3);
		driveBase.getBR().set(.3);
		driveBase.getFL().set(.3);
		driveBase.getFR().set(.3);
		checkTime();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
	
	}

}
