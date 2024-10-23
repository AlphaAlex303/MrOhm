package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.subsystems.DriveSubsystem;

public class OI {
    //makes the drivetrain and object
    private final DriveSubsystem m_drivetrain = new DriveSubsystem();
    //makes controler options
    public XboxController driveController, manipController;

    
    public OI() {
        initControllers();
        //drivetrain drive control
        m_drivetrain.setDefaultCommand(
            new RunCommand(
                () ->
                    //(UNCOMMENT FOR TANKDRIVE) m_drivetrain.tankDrive(
                    m_drivetrain.arcadeDrive( //(COMMENT FOR TANKDRIVE)
                        getDriveLeftY(), getDriveLeftX()),
                m_drivetrain));

    }

    /**
     * Initialize JoystickButtons and Controllers
     */
    private void initControllers() {
        driveController = new XboxController(0);
        manipController = new XboxController(1);

        

    }
    //gets the stick values
    //----------
    //—Left stick--
    //X-axis: 0
    //Y-axis: 1 and 2
    //—Right stick--
    //X-axis: 3
    //Y-axis: 4 and 5
    //----------
    private double getDriveLeftY() {
        return driveController.getRawAxis(1);

        
    }
    //gets the stick values
    private double getDriveLeftX() {
        //Replace the axis with "4" to use tank drive
        return driveController.getRawAxis(0);
        
    }
    

    


}