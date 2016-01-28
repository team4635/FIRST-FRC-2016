/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Succion extends Subsystem {
    private SpeedController motorSuccion;
	//private RobotDrive succionDrive;

    
    public Succion() {
        super();
        motorSuccion = new Talon(0);
        //succionDrive = new RobotDrive()

        }

    public void initDefaultCommand() {}
    public void log() {}
    
    public void setMotorSuccion(double velocidad){
		motorSuccion.set(velocidad);
	}
    
}
