package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class BajarVentana extends Command {
	
	public BajarVentana() {
		requires(Robot.ventana);
		//setTimeout(4.0);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		//Robot.ventana.setMotorVentana(.25);

	}

	protected void execute() {
		// TODO Auto-generated method stub
		Robot.ventana.setMotorVentana(.25);

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		//return isTimedOut();
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		//Robot.ventana.setMotorVentana(0.0);
	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
