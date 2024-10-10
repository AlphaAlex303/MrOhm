//imports the FRC subsystem package
package frc.subsystems;
//Adds our own imports
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Adds the motor controls
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


//adds the motor IDs
import static frc.robot.RobotMap.DrivetrainConstants.*;
//-----------


//Public Class for Drive
public class DriveSubsystem extends SubsystemBase {
    DifferentialDrive m_drivetrain;
    public void tankDrive(){
    
    //intitalizing CAN sparks to motors
    //-------
    //Left Side Drive
    CANSparkMax leftFront = new CANSparkMax(fLeftMotorID, MotorType.kBrushed);
    CANSparkMax leftRear = new CANSparkMax(bLeftMotorID, MotorType.kBrushed);
    //Right Side Drive
    CANSparkMax rightFront = new CANSparkMax(fRightMotorID, MotorType.kBrushed);
    CANSparkMax rightRear = new CANSparkMax(bRightMotorID, MotorType.kBrushed);
    //--------
    //Setting Current limits to not damage motors
    leftFront.setSmartCurrentLimit(CurrentLimit);
    leftRear.setSmartCurrentLimit(CurrentLimit);
    rightFront.setSmartCurrentLimit(CurrentLimit);
    rightRear.setSmartCurrentLimit(CurrentLimit);

    //sets the rear motors to follow the front
    leftRear.follow(leftFront);
    rightRear.follow(rightRear);
    
    //Makes both sides drive correctly
    leftFront.setInverted(true);
    rightFront.setInverted(false);


    m_drivetrain = new DifferentialDrive(leftFront, rightFront);
    
    }
    // Grabs values and puts it in
    public void arcadeDrive(double speed, double rotation){
        m_drivetrain.arcadeDrive(speed, rotation);
    }
    // Perodic func
    @Override
    public void periodic(){

    }

}
