package frc.robot;

/**
 * define Hardware Ports in here
 */


public final class RobotMap {

    //Mapping drive train motors
    public static class DrivetrainConstants {
        //CAN Drive motor mapping
        //---------------
        //Front left
        public static final int fLeftMotorID = 1;
        //Front right
        public static final int bLeftMotorID = 2;
        //Back left
        public static final int fRightMotorID = 3;
        //Back right
        public static final int bRightMotorID = 4;
        //----------------
        //Current limiter for drive motors
        public static final int kCurrentLimit = 60;
    }
}