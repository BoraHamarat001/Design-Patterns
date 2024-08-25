package animals.factoryP;

public class Zoo {
	AnimalFactory factory;
	public Zoo(AnimalFactory factory) {
		this.factory=factory;
	}
	public void getAnimal() {
		Animal animal;
		animal=factory.getAnimal();
		animal.noise();
	}
	
}
