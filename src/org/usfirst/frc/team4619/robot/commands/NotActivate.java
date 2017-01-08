package org.usfirst.frc.team4619.robot.commands;

public class NotActivate extends CommandBase {

	public NotActivate()
	{
		requires(climbMech);
	}
	
	protected void initialize()
	{
		
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		climbMech.pistonLeftBackward();
		climbMech.pistonRightBackward();
		climbMech.notSpin();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
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
