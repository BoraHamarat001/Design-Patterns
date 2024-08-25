package DUCKS.strategyP;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performfly();
		Duck duckmachine=new DuckMachine();
		duckmachine.performQuack();
		duckmachine.setQuackBehavior(new Quack());
		duckmachine.performQuack();
        System.out.println("---------");
        DuckCall duckcall=new DuckCall();
        duckcall.call();
	}

}
