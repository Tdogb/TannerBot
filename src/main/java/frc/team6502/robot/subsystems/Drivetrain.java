package frc.team6502.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6502.robot.Robot;
import frc.team6502.robot.commands.DefaultDrive;

public class Drivetrain extends Subsystem {
    Spark sparkLeft = new Spark(Robot.robotMap.leftSparkPin);
    Spark sparkLeft2 = new Spark(Robot.robotMap.left2SparkPin);
    Spark sparkRight = new Spark(Robot.robotMap.rightSparkPin);
    Spark sparkRight2 = new Spark(Robot.robotMap.right2SparkPin);

    /**
     * Default constructor
     */
    public Drivetrain() {

    }

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
        sparkLeft2.set(left);
        sparkRight.set(right);
        sparkRight2.set(right);

    }
}
