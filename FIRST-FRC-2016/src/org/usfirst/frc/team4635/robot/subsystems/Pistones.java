/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Pistones extends Subsystem {
	private DoubleSolenoid pistonLevantamiento1;
	private DoubleSolenoid pistonLevantamiento2;
	private DoubleSolenoid pistonEmpuje;
	
    
    public Pistones() {
        super();
        pistonLevantamiento1 = new DoubleSolenoid(0,3);
        pistonLevantamiento2 = new DoubleSolenoid(1,4);
        pistonEmpuje = new DoubleSolenoid(2,5);
        
    }

    public void initDefaultCommand() {
    	
    }
    public void log() {}
    
    public void levantar(){
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kForward);
    	pistonLevantamiento2.set(DoubleSolenoid.Value.kForward);
    	Timer.delay(1);
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kOff);
    	pistonLevantamiento2.set(DoubleSolenoid.Value.kOff);
    }
    public void bajar(){
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kReverse);
    	pistonLevantamiento2.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(1);
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kOff);
    	pistonLevantamiento2.set(DoubleSolenoid.Value.kOff);
    }
    public void empujeAbrir(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kForward);
    	Timer.delay(1);
    	pistonEmpuje.set(DoubleSolenoid.Value.kOff);
    }
    public void empujeCerrar(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kReverse);
    	Timer.delay(1);
    	pistonEmpuje.set(DoubleSolenoid.Value.kOff);
    }
    
    
}
