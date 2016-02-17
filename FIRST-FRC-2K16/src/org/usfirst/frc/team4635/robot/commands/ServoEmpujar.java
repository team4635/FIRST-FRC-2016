package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.Timer;


public class ServoEmpujar extends Command {
	
	public ServoEmpujar() {
		requires(Robot.servoL);
		//setTimeout(2.0);
		setTimeout(1.5);

	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		//Timer.delay(2.0);
		//Robot.servoL.lanzarServo(80);
	}

	protected void execute() {
		// TODO Auto-generated method stub
		//double x=timeSinceInitialized();
		//if(x>2.0){
			//Robot.succion.lanzarServo(80);
		//}
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub
		//Robot.servoL.lanzarServo(170);
		Robot.servoL.lanzarServo(80);


	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
