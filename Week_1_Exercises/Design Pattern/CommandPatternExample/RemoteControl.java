
public class RemoteControl {

	private Command cmd;

	public void pressButton(Command cmd) {
		this.cmd = cmd;
		executeCommand(this.cmd);
	}

	private void executeCommand(Command cmd) {
		cmd.execute();
	}
}
