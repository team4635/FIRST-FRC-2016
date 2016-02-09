
package org.usfirst.frc.team4635.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Lanzar extends CommandGroup {
    public Lanzar() {
    	addParallel(new MotoresLanzar());
    	addParallel(new PistonLanzar());	
    }
}