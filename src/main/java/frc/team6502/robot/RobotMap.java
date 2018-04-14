package frc.team6502.robot;

import com.analog.adis16448.frc.ADIS16448_IMU;

public class RobotMap {
    public static final int leftSparkPin = 0;
    public static final int left2SparkPin = 1;
    public static final int rightSparkPin = 3;
    public static final int right2SparkPin = 4;
    public static final double analogJoystickAxisDeadband = 1;
    //public static final ADIS16448_IMU IMU = new ADIS16448_IMU(ADIS16448_IMU.Axis.kZ, ADIS16448_IMU.AHRSAlgorithm.kMadgwick);
    public static final ADIS16448_IMU imu = new ADIS16448_IMU();


    /**
     * Default constructor
     */
    public RobotMap() {

    }
}
