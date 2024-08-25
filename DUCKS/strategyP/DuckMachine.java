package DUCKS.strategyP;

public class DuckMachine extends Duck {
	
	public DuckMachine() {
		quackbehavior=new Sequack();
	}
	public void display() {
		System.out.println("I'm duck machine!");
    }

}
