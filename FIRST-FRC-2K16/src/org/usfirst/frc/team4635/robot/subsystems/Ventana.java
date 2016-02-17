/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Ventana extends Subsystem {
    private SpeedController motorVentana;
    
    public Ventana() {
        super();
        motorVentana = new Talon(0);
    }

    public void initDefaultCommand() {
    }
    public void log() {}
    
    public void setMotorVentana(double velocidad){
    	motorVentana.set(velocidad);
	}
    
    
}