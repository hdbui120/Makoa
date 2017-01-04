package org.usfirst.frc.team4619.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public enum GameField
	{
		//create constants
		FIELD_LENGTH(4),FIELD_WIDTH(0);
		
		//set values for constants 
		int constants = 0;
		private GameField(int i)
		{
			constants = i;
		}
		
		//get values of constants
		public int getGameFieldConstants()
		{
			return constants;
		}
		
	}
	
	public static int frontLeftDrive = 0;
	public static int backLeftDrive = 1;
	public static int frontRightDrive = 2;
	public static int backRightDrive = 3;
}
