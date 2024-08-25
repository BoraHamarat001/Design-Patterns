package animals.factoryP;

public class Eagle implements Animal {
	public Eagle() {}
	@Override
	public void noise() {
		System.out.println("I am an Eagle");
	}
	public void fly(int meter) {
		System.out.println("Eagles fly and I currently do in "+meter+" meter high!");
	}

}
