package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

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


        private double getDriveLeftX(){
            return driveController.getRawAxis(0);
        }

        private double getDriveLeftY(){
            return -driveController.getRawAxis(1);
        }
    }
    }
    }


}