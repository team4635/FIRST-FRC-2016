/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import org.usfirst.frc.team4635.robot.commands.PararSuccion;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class SuccionLanzamiento extends Subsystem {
	private SpeedController motorSuccionIzquierdo;
    private SpeedController motorSuccionDerecho;
	private RobotDrive succionDrive;
    
    public SuccionLanzamiento() {
        super();
        motorSuccionIzquierdo = new Talon(5);
        motorSuccionDerecho = new Talon(6);
        succionDrive = new RobotDrive(motorSuccionIzquierdo, motorSuccionDerecho);
        }

    public void initDefaultCommand() {
    	setDefaultCommand(new PararSuccion());
    }
    public void log() {}
    
    public void setSuccionDrive(double velocidad){
    	succionDrive.tankDrive(velocidad, velocidad);
	}
    
}
