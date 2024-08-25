package HomeAutomation.commandP;

public class MacroCommand implements CalculatorCommand {
	CalculatorCommand[] commands;
	public MacroCommand(CalculatorCommand[] commands) {
		this.commands=commands;
	}
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			 commands[i].execute();
		}
	}
	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			 commands[i].undo();
		}
	}
	@Override
	public int getValue() {
		int total=0;
		for (int i = 0; i < commands.length; i++) {
			 total+=commands[i].getValue();
		}
		if(total<0) {
			return 0;
		}
		return total;
	}
}
