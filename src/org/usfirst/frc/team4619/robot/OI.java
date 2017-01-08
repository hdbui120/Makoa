package org.usfirst.frc.team4619.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4619.robot.RobotMap;
import org.usfirst.frc.team4619.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//created a joystick object (the xbox controller)
    public Joystick xbox = new Joystick(0);	
    
    //created xbox controller's buttons
	public Button A;
	public Button B;
	public Button X;
	public Button Y;
	public Button LBumper;
	public Button RBumper;
	public Button Back;
	public Button Start;
	
	public int[] buttonValues = {RobotMap.A, RobotMap.B, RobotMap.X, RobotMap.Y,
								 RobotMap.L_BUMPER, RobotMap.R_BUMPER, RobotMap.BACK, RobotMap.START};
	
	public Button [] buttons = {A, B, X, Y, LBumper, RBumper, Back, Start};
	
	public void setButtonValues()
	{
		for(Button xboxButtons:buttons)
		{
			for(int values:buttonValues)
			{
				xboxButtons = new JoystickButton(xbox, values);
			}
		}
	}
	
	//class constructor
	public OI()
	{
		setButtonValues();
	}
	
	public double getXAxis()
	{
		return xbox.getRawAxis(0);
	}
	
	public double getYAxis()
	{
		return xbox.getRawAxis(1);
	}
}

