/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4635.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4635.robot.commands.Autonomous;
import org.usfirst.frc.team4635.robot.commands.ControlPWM;
import org.usfirst.frc.team4635.robot.subsystems.Claw;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4635.robot.subsystems.Elevator;
import org.usfirst.frc.team4635.robot.subsystems.Lanzamiento;
import org.usfirst.frc.team4635.robot.subsystems.PistonesE;
import org.usfirst.frc.team4635.robot.subsystems.PistonesL;
import org.usfirst.frc.team4635.robot.subsystems.Succion;
import org.usfirst.frc.team4635.robot.subsystems.Wrist;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Command autonomousCommand;
    CameraServer server1;
    CameraServer server2;

//comment
    //Command controlPWM;
    
    public static DriveTrain drivetrain;
    public static Elevator elevator;
    public static Wrist wrist;
    public static Claw claw;
    public static Lanzamiento lanzamiento;
    public static Succion succion;
    public static PistonesL pistones;
    public static PistonesE pistonesE;
    public static OI oi;
    

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // Initialize all subsystems
        drivetrain = new DriveTrain();
        elevator = new Elevator();
        wrist = new Wrist();
        claw = new Claw();
        lanzamiento = new Lanzamiento();
        succion = new Succion();
        pistones = new PistonesL();
        pistonesE = new PistonesE();
        oi = new OI();
        
        server1 = CameraServer.getInstance();
        server1.setQuality(30);
        server1.startAutomaticCapture("cam2");

        server2 = CameraServer.getInstance();
        //the camera name (ex "cam0") can be found through the roborio web interface
        server2.setQuality(30);
        //the camera name (ex "cam0") can be found through the roborio web interface
        server2.startAutomaticCapture("cam1");

       
        
        // instantiate the command used for the autonomous period
        autonomousCommand = new Autonomous();
        //controlPWM = new ControlPWM();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(drivetrain);
        SmartDashboard.putData(elevator);
        SmartDashboard.putData(wrist);
        SmartDashboard.putData(claw);
    }

    public void autonomousInit() {
        autonomousCommand.start(); // schedule the autonomous command (example)
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

    public void teleopInit() {
    	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
        //controlPWM.start();

    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
    private void log() {
        wrist.log();
        elevator.log();
        drivetrain.log();
        claw.log();
    }
}
