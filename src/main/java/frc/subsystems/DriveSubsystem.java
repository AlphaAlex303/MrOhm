package frc.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkLowLevel.MotorType;


public class DriveSubsystem extends SubsystemBase {

    //intitalizing CAN sparks to motors
    //-------
    //Left Side Drive
    CANSparkMax leftFront = new CANSparkMax(frc.robot.RobotMap.DrivetrainConstants.fLeftMotorID, MotorType.kBrushed);
    CANSparkMax leftRear = new CANSparkMax(frc.robot.RobotMap.DrivetrainConstants.bLeftMotorID, MotorType.kBrushed);
    //Right Side Drive
    CANSparkMax rightFront = new CANSparkMax(frc.robot.RobotMap.DrivetrainConstants.fRightMotorID, MotorType.kBrushed);
    CANSparkMax rightRear = new CANSparkMax(frc.robot.RobotMap.DrivetrainConstants.bRightMotorID, MotorType.kBrushed);
    //--------
    //
    public static void driveTrain() {
        
    } 
}
