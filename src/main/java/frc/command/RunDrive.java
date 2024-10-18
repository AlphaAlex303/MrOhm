package frc.command;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OI;
import frc.subsystems.DriveSubsystem.*;
public class RunDrive extends Command {
    private Drivetrain drivetrain;
    public void Drive(){
        this.drivetrain = OI.drivetrain;   
        drive(()->getDriveLeftY(),()->getDriveRightY()); 
    }
}