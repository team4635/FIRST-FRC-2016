package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class toggleMotores extends Command {
	
	public toggleMotores() {
		requires(Robot.drivetrain);
		
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.drivetrain.setMotores(.7);
	}

	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.drivetrain.setMotores(0);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
