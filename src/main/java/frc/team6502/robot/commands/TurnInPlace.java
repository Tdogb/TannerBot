package frc.team6502.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team6502.robot.Robot;

public class TurnInPlace extends Command {

    private double angle;

    public TurnInPlace(double angle) {
        requires(Robot.drivetrain);
        this.angle = angle;
    }

    @Override
    protected void execute() {
        Robot.drivetrain.drive(1, -1);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
