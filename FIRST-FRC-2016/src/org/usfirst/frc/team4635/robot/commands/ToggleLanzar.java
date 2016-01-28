package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleLanzar extends Command {
	
	public ToggleLanzar() {
		requires(Robot.lanzamiento);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
	
	}

	protected void execute() {
		// TODO Auto-generated method stub
	
		Robot.lanzamiento.setMotoresLanzamiento(1.0, 1.0);
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.lanzamiento.setMotoresLanzamiento(0.0, 0.0);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
