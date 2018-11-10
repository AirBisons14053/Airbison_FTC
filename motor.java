import com.qualcomm.robotcore.hardware.DcMotor;

public class YourClassName extends OpMode {
 
    DcMotor arm_motor;
    public void init() {
      arm_motor = hardwareMap.dcMotor.get("arm");
      arm_motor.setDirection(DcMotor.Direction.REVERSE);
    }
    public void loop() {
      arm_motor.setPower(-0.75);
      int position = arm_motor.getCurrentPosition();
      telemetry.addData("Encoder Position", position);
      arm_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
      arm_motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
      
      float left_power = -gamepad1.left_stick_y;
      float right_power = -gamepad1.right_stick_y;
 
      left_drive.setPower(left_power);
      right_drive.setPower(right_power);
      
    }
}
