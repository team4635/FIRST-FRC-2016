/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Have the robot drive tank style using the PS3 Joystick until interrupted.
 */
public class TankDriveWithJoystick extends Command {
	Joystick joy;
	Joystick joyCopiloto;

    //Joystick joy = Robot.oi.getJoystick();
    public TankDriveWithJoystick() {
        requires(Robot.drivetrain);
		requires(Robot.pistones);

    }

    // Called just before this Command runs the f iirst time
    protected void initialize() {
    	joy = Robot.oi.getJoystick();
    	joyCopiloto = Robot.oi.getJoystickCopiloto();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.drive(Robot.oi.getJoystick());
        //System.out.println("Estado POV: " + joy.getPOV(0));
        /**if(joy.getPOV()==0){
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
		}**/
        //controlar velocidad
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
		
		//Para controlar el levantamiento
		if(joyCopiloto.getPOV()==0){
			 Robot.pistones.levantar();
		}
		if(joyCopiloto.getPOV()==180){
			 Robot.pistones.bajar();
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; // Runs until interrupted
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
