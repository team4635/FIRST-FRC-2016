package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class PararLanzamiento extends Command {
	
	public PararLanzamiento() {
		requires(Robot.succion);
		
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.succion.setSuccionDrive(0.0);

	}

	protected void execute() {
		// TODO Auto-generated method stub
	
		//Robot.succion.setMotorSuccion(.7);
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		//Robot.succion.setMotorSuccion(0.0);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
