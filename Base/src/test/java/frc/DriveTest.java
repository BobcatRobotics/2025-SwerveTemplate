package frc.robot;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import frc.robot.generated.TunerConstants;
import frc.robot.subsystems.drive.CTRE.Drive;
import frc.robot.subsystems.drive.CTRE.GyroIO;
import frc.robot.subsystems.drive.CTRE.GyroIOPigeon2;
import frc.robot.subsystems.drive.CTRE.ModuleIO;
import frc.robot.subsystems.drive.CTRE.ModuleIOTalonFX;
import org.junit.jupiter.api.Test;

public class DriveTest {
  @Test
  void moduleInitializationTest() {
    ModuleIO fl = new ModuleIOTalonFX(TunerConstants.FrontLeft);
    assertNotNull(fl);
    ModuleIO fr = new ModuleIOTalonFX(TunerConstants.FrontRight);
    assertNotNull(fr);
    ModuleIO bl = new ModuleIOTalonFX(TunerConstants.BackLeft);
    assertNotNull(bl);
    ModuleIO br = new ModuleIOTalonFX(TunerConstants.BackRight);
    assertNotNull(br);
  }

  @Test
  void gyroInitializationTest() {
    GyroIO pigeon2 = new GyroIOPigeon2();
    assertNotNull(pigeon2);
  }

  @Test
  void driveInitializationTest() {
    Drive drive =
        new Drive(
            new GyroIOPigeon2(),
            new ModuleIOTalonFX(TunerConstants.FrontLeft),
            new ModuleIOTalonFX(TunerConstants.FrontRight),
            new ModuleIOTalonFX(TunerConstants.BackLeft),
            new ModuleIOTalonFX(TunerConstants.BackRight));
    assertNotNull(drive);
  }
}
