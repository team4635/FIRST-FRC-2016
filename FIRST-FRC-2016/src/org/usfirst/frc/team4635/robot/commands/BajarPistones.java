package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.Pistones;

import edu.wpi.first.wpilibj.command.Command;

public class BajarPistones extends Command {
	
	public BajarPistones() {
		requires(Robot.pistones);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.pistones.bajar();

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

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
