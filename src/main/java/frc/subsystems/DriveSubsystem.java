package frc.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import static frc.robot.RobotMap.DrivetrainConstants;

import java.sql.Timestamp;

public class DriveSubsystem extends SubsystemBase {
    //intitalizing CAN sparks to motors
    CANSparkMax leftFront = new CANSparkMax(fLeftMotorID, MotorType.kBrushed);
    CANSparkMax leftRear = new CANSparkMax(fRightMotorID, MotorType.kBrushed);
    CANSparkMax rightFront = new CANSparkMax(bLeftMotorID, MotorType.kBrushed);
    CANSparkMax rightRear = new CANSparkMax(bRightMotorID, MotorType.kBrushed);

    public driveTrain() {
        
    }
}
