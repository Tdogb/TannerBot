package frc.team6502.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team6502.robot.Robot;

public class DefaultDrive extends Command {

    public DefaultDrive() {
        requires(Robot.drivetrain);
    }
    @Override
    protected void execute() {
        drive(Robot.oi.getThrottle(), Robot.oi.getThrottle());
    }
    @Override
    protected boolean isFinished() {
        return false;
    }

    public void drive(double left, double right) {
        Robot.drivetrain.drive(left, right);
    }

}
