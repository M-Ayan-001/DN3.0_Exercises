
public class Test {

	public static void main(String[] args) {

		Light light1 = new Light("Kitchen Light");
		Command lightOn = new LightOnCommand(light1);
		Command lightOff = new LightOffCommand(light1);

		RemoteControl RC = new RemoteControl();
		RC.pressButton(lightOn);
		RC.pressButton(lightOff);
	}
}
