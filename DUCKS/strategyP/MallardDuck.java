package DUCKS.strategyP;

public class MallardDuck extends Duck {
	public MallardDuck() {
		 quackbehavior = new Quack();
		 flybehavior = new FlyNoWay();
		 }
	public void display() {
		System.out.println("I'm a real mallard duck!");
	}
}
