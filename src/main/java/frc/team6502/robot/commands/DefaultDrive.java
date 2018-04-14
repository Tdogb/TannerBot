package frc.team6502.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import frc.team6502.robot.Robot;
import frc.team6502.robot.RobotMap;

public class DefaultDrive extends Command {
    private double pidOutput = 0;

    /**
     * Constructs the pids
     */
    public DefaultDrive() {
        requires(Robot.drivetrain);
    }
    @Override
    protected void execute() {
        double throttle = Robot.oi.getThrottle();
        double turning = Robot.oi.getTurning();
        drive(throttle + turning, throttle - turning);
    }
    @Override
    protected boolean isFinished() {
        return false;
    }

    /**
     * Runs the drive method inside of Drivetrain
     * @param left
     * @param right
     */
    public void drive(double left, double right) {
        Robot.drivetrain.drive(left, right);
    }

}
