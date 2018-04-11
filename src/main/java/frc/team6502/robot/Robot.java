package frc.team6502.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team6502.robot.subsystems.Drivetrain;

public class Robot extends IterativeRobot {
    private OI oi;
    public static Drivetrain drivetrain;

    @Override
    public void robotInit() {
        drivetrain = new Drivetrain();
        oi = new OI();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }

    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() { }

    @Override
    public void testPeriodic() { }
}