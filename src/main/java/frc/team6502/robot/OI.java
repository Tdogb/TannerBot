package frc.team6502.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team6502.robot.commands.DefaultDrive;

public class OI {
    Joystick joystick;
    DefaultDrive drive = new DefaultDrive();

    public OI() {
        joystick = new Joystick(0);
        JoystickButton[] but = {null, new JoystickButton(joystick,1), new JoystickButton(joystick, 2)};
    }

    /**
     * getThrottle
     * @return Throttle value
     */
    public double getThrottle() {
        return joystick.getY();
    }
    public double getTurning() {
        return joystick.getX();
    }
}
