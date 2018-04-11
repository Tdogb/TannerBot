package frc.team6502.robot;

import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6502.robot.commands.DefaultDrive;

public class Drivetrain extends Subsystem {
    Spark sparkLeft = new Spark(RobotMap.leftSparkPin);
    Spark sparkRight = new Spark(RobotMap.rightSparkpin);

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DefaultDrive());
    }

    /**
     * drive Sends values to Spark ESCs
     * Values should be between -1.0 and 1.0
     * @param left Drives spark designated as left
     * @param right Drives spark designated as left
     */
    public void drive(double left, double right) {
        sparkLeft.set(left);
        sparkRight.set(right);

    }
}
