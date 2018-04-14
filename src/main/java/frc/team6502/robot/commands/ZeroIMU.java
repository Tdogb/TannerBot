package frc.team6502.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.team6502.robot.RobotMap;

public class ZeroIMU extends InstantCommand {
    public ZeroIMU() { }

    @Override
    protected void execute() {
        RobotMap.imu.reset();
    }

}
