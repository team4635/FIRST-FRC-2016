/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import org.usfirst.frc.team4635.robot.commands.Lanzar;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Lanzamiento extends Subsystem {
    private SpeedController motorLanzamientoIzquierdo;
    private SpeedController motorLanzamientoDerecho;
	private RobotDrive lanzamientoDrive;

    
    public Lanzamiento() {
        super();
        motorLanzamientoIzquierdo = new Talon(5);
        motorLanzamientoDerecho = new Talon(6);
        lanzamientoDrive = new RobotDrive(motorLanzamientoIzquierdo, motorLanzamientoDerecho);

    }

    public void initDefaultCommand() {
    	setDefaultCommand(new Lanzar());
    }
    public void log() {}
    
    public void setMotoresLanzamiento(double velocidadIzquierda, double velocidadDerecha){
		//drive.tankDrive(velocidadIzquierda, velocidadDerecha);
		
		//lanzador_izquierdo_motor.set(velocidadIzquierda);
		//lanzador_derecho_motor.set(velocidadDerecha);
		
		lanzamientoDrive.tankDrive(velocidadIzquierda, velocidadDerecha);
	}
    
    
}
