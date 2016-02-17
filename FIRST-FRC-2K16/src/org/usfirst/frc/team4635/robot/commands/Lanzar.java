package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class Lanzar extends Command {
	
	public Lanzar() {
		requires(Robot.succion);
		setTimeout(4);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		//Robot.succion.setSuccionDrive(.6);

	}

	protected void execute() {
		// TODO Auto-generated method stub
		Robot.succion.setSuccionDrive(-1.0);
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.succion.setSuccionDrive(1.0);
		Robot.servoL.lanzarServo(170);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
