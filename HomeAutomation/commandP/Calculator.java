package HomeAutomation.commandP;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Calculator {
	CalculatorCommand[] onCommands;
	CalculatorCommand[] offCommands;
	Stack<CalculatorCommand> undoStack=new Stack<>();
	Queue<CalculatorCommand> commandQueue=new LinkedList<>();
	int total=0;
	public Calculator() {
		onCommands=new CalculatorCommand[6];
		offCommands=new CalculatorCommand[6];
		CalculatorCommand noCommand=new NoCommand();
		
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
	}
	public void setCommand(int slot,CalculatorCommand onCommand,CalculatorCommand offCommand) {
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	public void clickOn(int slot) {
		
		this.onCommands[slot].execute();
		undoStack.add(onCommands[slot]);
		total+=this.onCommands[slot].getValue();
		this.message();
	}
	public void clickOff(int slot) {
		this.offCommands[slot].execute();
		undoStack.add(onCommands[slot]);
		total+=this.offCommands[slot].getValue();
		this.message();
	}
	public void clickUndo() {
		if(undoStack.size()!=0) {
		CalculatorCommand currentUndoCommand =undoStack.pop();
		currentUndoCommand.undo();
		total+=currentUndoCommand.getValue();
		this.message();
		}
	}
	
	public void message() {
		System.out.println("Total is: "+total);
	}
	
	
	

}
