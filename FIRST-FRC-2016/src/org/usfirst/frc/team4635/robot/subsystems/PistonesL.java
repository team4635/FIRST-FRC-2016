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

public class PistonesL extends Subsystem {
	private DoubleSolenoid pistonLevantamiento1;
	//private DoubleSolenoid pistonEmpuje;
	
    
    public PistonesL() {
        super();
        pistonLevantamiento1 = new DoubleSolenoid(3,0);
        //pistonEmpuje = new DoubleSolenoid(7,4);
        
    }

    public void initDefaultCommand() {
    	
    }
    public void log() {}
    
    public void levantar(){
    	//pistonLevantamiento1.set(DoubleSolenoid.Value.kForward);
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kReverse);

    }
    public void bajar(){

    	//pistonLevantamiento1.set(DoubleSolenoid.Value.kReverse);
    	pistonLevantamiento1.set(DoubleSolenoid.Value.kForward);

    }
    /**
    public void empujeAbrir(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kForward);

    }
    public void empujeCerrar(){
    	pistonEmpuje.set(DoubleSolenoid.Value.kReverse);

    }**/
    
    
}
