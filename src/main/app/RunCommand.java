package main.app;

public class RunCommand {
	Command command;
	public void SetCommand(Command command) {
		this.command = command;
	}
	public void Run() {
		command.execute();
	}
}
