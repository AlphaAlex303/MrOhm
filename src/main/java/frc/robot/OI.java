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
                    //m_drivetrain.tankDrive(
                    m_drivetrain.arcadeDrive(

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
    private double getDriveLeftY() {
        return driveController.getRawAxis(1);

        
    }
    //gets the stick values
    private double getDriveLeftX() {
        return driveController.getRawAxis(2);
        //return driveController.getRawAxis(4);
        
    }
    

    


}