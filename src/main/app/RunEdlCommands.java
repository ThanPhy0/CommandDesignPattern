package main.app;

public class RunEdlCommands implements Command {
	EdlCommands edlCommands;
	public RunEdlCommands(EdlCommands edlCommands) {
		this.edlCommands = edlCommands;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		edlCommands.readInfo();
	}

}
