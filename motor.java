import com.qualcomm.robotcore.hardware.DcMotor;

@Teleop(name = "Bison", group = "x")
public class tryThisRED extends OpMode { //OpMode runs as long as the program is running, LinearOpMode only runs once
	public DcMotor rightFront;
	public DcMotor leftFront;
	public DcMotor rightBack;
	public DcMotor leftBack;
	@Override public void runOpMode() {
 		rightFront = hardwareMap.dcMotor.get("rightFront");
		leftFront = hardwareMap.dcMotor.get("leftFront");
		rightBack = hardwareMap.dcMotor.get("rightBack");
		leftBack = hardwareMap.dcMotor.get("leftBack");
		
		rightFront.setPower(gamepad1.rightstick_y);
		leftFront.setPower(-gamepad1.leftstick_y);
		rightBack.setPower(gamepad1.rightstick_y);
		leftBack.setPower(-gamepad1.leftstick_y);
		

 
    }
}
