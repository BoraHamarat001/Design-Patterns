package animals.factoryP;

public class Duck implements Animal {
	public Duck() {}
	@Override
	public void noise() {
		System.out.println("Vak vak... I am a duck");
	}
	public void fly(int meter) {
		System.out.println("Ducks can fly and I currrently do in "+ meter+" meter high!");	
	}

}
