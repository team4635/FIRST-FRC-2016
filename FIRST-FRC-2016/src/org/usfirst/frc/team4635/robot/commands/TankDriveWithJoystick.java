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
    //Joystick joy = Robot.oi.getJoystick();
    public TankDriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the f iirst time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.drive(Robot.oi.getJoystick());
        //System.out.println("Estado POV: " + joy.getPOV(0));
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
