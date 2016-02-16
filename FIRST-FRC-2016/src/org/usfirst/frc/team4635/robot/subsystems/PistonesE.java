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

public class PistonesE extends Subsystem {
	private DoubleSolenoid pistonEmpuje;
	
    
    public PistonesE() {
        super();
        pistonEmpuje = new DoubleSolenoid(7,4);
        
    }

    public void initDefaultCommand() {
    	
    }
    public void log() {}
    
    public void empujeAbrir(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kForward);
    	//pistonEmpuje.set(DoubleSolenoid.Value.kReverse);

    }
    public void empujeCerrar(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kReverse);
    	//pistonEmpuje.set(DoubleSolenoid.Value.kForward);


    }
    
    
}
