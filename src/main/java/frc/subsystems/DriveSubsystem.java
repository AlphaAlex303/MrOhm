//imports the FRC subsystem package
package frc.subsystems;
//Adds our own imports
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Adds the motor controls
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import java.util.function.Supplier;


//adds the motor IDs
import static frc.robot.RobotMap.DrivetrainConstants.*;
//-----------


//Public Class for Drive
public class DriveSubsystem extends SubsystemBase {
    //Inititalizing CAN Sparks
    private CANSparkMax leftFront;
    private CANSparkMax leftRear;
    private CANSparkMax rightFront;
    private CANSparkMax rightRear;
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
        leftFront.setInverted(true);
        rightFront.setInverted(false);


        
    }
    // Grabs values and puts it in

    public void drive(Supplier<Double> rightSpeed, Supplier<Double>leftSpeed){
        this.leftFront.set(leftSpeed.get());
        this.rightFront.set(rightSpeed.get());
    }
    // Perodic func
    @Override
    public void periodic(){

    }

}
