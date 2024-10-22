package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.subsystems.DriveSubsystem;

public class OI {

    private final DriveSubsystem m_drivetrain = new DriveSubsystem();
    public XboxController driveController, manipController;

    
    public OI() {
        initControllers();
        m_drivetrain.setDefaultCommand(
            new RunCommand(
                () ->
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
    private double getDriveLeftY() {
        return driveController.getRawAxis(1);

        
    }
    private double getDriveLeftX() {
        return driveController.getRawAxis(2);
        
    }
    

    


}