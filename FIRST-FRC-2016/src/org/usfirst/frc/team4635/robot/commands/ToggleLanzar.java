package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleLanzar extends Command {
	Joystick joy;
	
	public ToggleLanzar() {
		requires(Robot.lanzamiento);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		joy = Robot.oi.getJoystick();
	}

	protected void execute() {
		// TODO Auto-generated method stub
		if(joy.getPOV==0){
			Robot.lanzamiento.setMotoresLanzamiento(1.0, 1.0);
		}
		if(joy.getPOV==45){
			Robot.lanzamiento.setMotoresLanzamiento(1.0, 0.9);
		}
		if(joy.getPOV==90){
			Robot.lanzamiento.setMotoresLanzamiento(1.0, 0.7);
		}
		if(joy.getPOV==315){
			Robot.lanzamiento.setMotoresLanzamiento(0.9, 1.0);
		}
		if(joy.getPOV==270){
			Robot.lanzamiento.setMotoresLanzamiento(0.7, 1.0);
		}
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
