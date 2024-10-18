package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.subsystems.DriveSubsystem.*;
import frc.command.*;
import frc.robot.*;

public class OI {


    public XboxController driveController, manipController;

    public OI() {
        initControllers();


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
    private double getDriveRightY() {
        return driveController.getRawAxis(4);
        
    }
    public static Drivetrain Drivetrain;

    


}