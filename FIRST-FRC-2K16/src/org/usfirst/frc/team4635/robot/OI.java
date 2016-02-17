
package org.usfirst.frc.team4635.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4635.robot.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick joy = new Joystick(0);
    private Joystick joyCopiloto = new Joystick(1);

    public OI() {
    	// Put Some buttons on the SmartDashboard
       
        
        SmartDashboard.putData("Deliver Soda", new Autonomous());
        
        // Create some buttons
        JoystickButton d_up = new JoystickButton(joy, 5);
        JoystickButton d_right= new JoystickButton(joy, 6);
        JoystickButton d_down= new JoystickButton(joy, 7);
        JoystickButton d_left = new JoystickButton(joy, 8);
        JoystickButton l2 = new JoystickButton(joy, 9);
        JoystickButton r2 = new JoystickButton(joy, 10);
        JoystickButton l1 = new JoystickButton(joy, 11);
        JoystickButton r1 = new JoystickButton(joy, 12);
       
        //JoystickButton xXbox = new JoystickButton(joy, 3);
        JoystickButton btnAPiloto = new JoystickButton(joy, 1);
        JoystickButton btnBPiloto = new JoystickButton(joy, 2);
        JoystickButton btnYPiloto = new JoystickButton(joy, 4);
        JoystickButton btnXPiloto = new JoystickButton(joy, 3);
        JoystickButton btnBumperIzqPiloto = new JoystickButton(joy, 5);
        JoystickButton btnBumperDerPiloto = new JoystickButton(joy, 6);
        JoystickButton btnStartPiloto = new JoystickButton(joy, 8);

        // Connect the buttons to commands
    
        //l2.whenPressed(new Autonomous());
        
       // xXbox.whenReleased(new gira90());
        
        //btnYCopiloto.whileHeld(new MotoresLanzar());
        
        btnAPiloto.whenPressed(new Succionar());
        btnAPiloto.whenReleased(new PararSuccion());
        btnBPiloto.whenPressed(new LevantarVentana());
        btnBPiloto.whenReleased(new PararVentana());
        //btnBPiloto.whileHeld(new LevantarVentana());
        btnXPiloto.whenPressed(new BajarVentana());
        btnXPiloto.whenReleased(new PararVentana());
        //btnXPiloto.whileHeld(new BajarVentana());
        
        //btnYPiloto.whenPressed(new Lanzar());
        //btnYPiloto.whenReleased(new PararLanzamiento());
        btnYPiloto.whenPressed(new Lanzar());
        btnYPiloto.whenPressed(new ServoEmpujar());
        //btnStartPiloto.whenPressed(new ServoEmpujar());
        btnBumperIzqPiloto.whileHeld(new RotarIzquierda());
        btnBumperDerPiloto.whileHeld(new RotarDerecha());
    }
    
    public Joystick getJoystick() {
        return joy;
    }
    public Joystick getJoystickCopiloto() {
    	return joyCopiloto;
    }
}

