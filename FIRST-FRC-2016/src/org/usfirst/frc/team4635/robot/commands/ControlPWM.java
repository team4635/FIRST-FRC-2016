package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class ControlPWM extends Command{
	Joystick joy;
	
	public ControlPWM(){
		requires(Robot.lanzamiento);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
        joy = Robot.oi.getJoystick();
	}

	protected void execute() {
		// TODO Auto-generated method stub
		if(joy.getPOV()==0){
			Robot.drivetrain.vMax=1.0;
		}
		if(joy.getPOV()==90){
			Robot.drivetrain.vMax=0.4;
		}
		if(joy.getPOV()==180){
			Robot.drivetrain.vMax=0.6;
		}
		if(joy.getPOV()==270){
			Robot.drivetrain.vMax=0.8;
		}
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
