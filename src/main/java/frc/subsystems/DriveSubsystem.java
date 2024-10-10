//imports the FRC subsystem package
package frc.subsystems;
//Adds our own imports
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Adds the CAN Spark Max controls 
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

//adds the motor IDs
import static frc.robot.RobotMap.DrivetrainConstants.fLeftMotorID;
import static frc.robot.RobotMap.DrivetrainConstants.bLeftMotorID;
import static frc.robot.RobotMap.DrivetrainConstants.fRightMotorID;
import static frc.robot.RobotMap.DrivetrainConstants.bRightMotorID;

//Public Class for Drive
public class DriveSubsystem extends SubsystemBase {

    //intitalizing CAN sparks to motors
    //-------
    //Left Side Drive
    CANSparkMax leftFront = new CANSparkMax(fLeftMotorID, MotorType.kBrushed);
    CANSparkMax leftRear = new CANSparkMax(bLeftMotorID, MotorType.kBrushed);
    //Right Side Drive
    CANSparkMax rightFront = new CANSparkMax(fRightMotorID, MotorType.kBrushed);
    CANSparkMax rightRear = new CANSparkMax(bRightMotorID, MotorType.kBrushed);
    //--------
    

    
}
