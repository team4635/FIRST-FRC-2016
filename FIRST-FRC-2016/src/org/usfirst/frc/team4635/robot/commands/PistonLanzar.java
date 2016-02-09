package org.usfirst.frc.team4635.robot.commands;

//import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.Pistones;

import edu.wpi.first.wpilibj.command.Command;

public class PistonLanzar extends Command {
	//Joystick joy;
	
	public PistonLanzar() {
		requires(Robot.pistones);
        setTimeout(2);

	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.pistones.empujeAbrir();
	}

	protected void execute() {
		// TODO Auto-generated method stub	
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
        return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.pistones.empujeCerrar();

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
