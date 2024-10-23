//imports the FRC subsystem package
package frc.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
//Adds our own imports
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Adds the motor controls
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;


//adds the motor IDs
import static frc.robot.RobotMap.DrivetrainConstants.*;
//-----------

//Public Class for Drive
public class DriveSubsystem extends SubsystemBase {
    //Inititalizing CAN Sparks and giving them names
    private CANSparkMax leftFront;
    private CANSparkMax leftRear;
    private CANSparkMax rightFront;
    private CANSparkMax rightRear;

    //makes the drive train a thing
    DifferentialDrive m_drivetrain;


    public void drivetrain(){
    
        //intitalizing CAN sparks to motors
        //-------
        //Left Side Drive
        this.leftFront = new CANSparkMax(fLeftMotorID, MotorType.kBrushed);
        this.leftRear = new CANSparkMax(bLeftMotorID, MotorType.kBrushed);
        //Right Side Drive
        this.rightFront = new CANSparkMax(fRightMotorID, MotorType.kBrushed);
        this.rightRear = new CANSparkMax(bRightMotorID, MotorType.kBrushed);
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
        //---UNCOMENT FOR TANK DRIVE---
        //leftFront.setInverted(true);
        //rightFront.setInverted(false);


        
    }
    //Drive options

    //Uses the built in arcade drive to use arcade drive (One stick control)
    public void arcadeDrive(double speed, double rotation) {
        m_drivetrain.arcadeDrive(speed, rotation);
    }

    //Uses tank drive (Lawnmower) (Duel joystick)
    public void tankDrive(double leftSpeed, double rightSpeed){
        this.leftFront.set(leftSpeed);
        this.rightFront.set(rightSpeed);
    }
    // Perodic func
    @Override
    public void periodic(){

    }

}
