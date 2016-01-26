package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class gira90 extends Command {
	//Joystick joy;
	//RobotDrive drive;
	//OI oi = new OI();
	//DriveTrain drivetrain = new DriveTrain();
	
	
	
	
	public gira90() {
		
		requires(Robot.drivetrain);
		
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		//joy= oi.getJoystick();
		//drive=drivetrain.getDrive();
	}

	protected void execute() {
		// TODO Auto-generated method stub
		//drive.drive(joy);
		//if(joy.getRawAxis(1)==0.0&&joy.getRawAxis(5)==0.0){
		Gyro gyro = new Gyro(1);
		while (gyro.getAngle()<90){
		Robot.drivetrain.turnMe(.5);
		}
			
		//}else{DriveTrain.drive(-joy.getRawAxis(1), -joy.getRawAxis(5));}
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.drivetrain.setMotores(0.0);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
