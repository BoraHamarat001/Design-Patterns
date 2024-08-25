package DUCKS.strategyP;

public class DuckCall {
	QuackBehavior quackbehavior;
	public DuckCall() {
		quackbehavior=new Sequack();
	}
	public void call() {
		quackbehavior.quack();
	}

}
