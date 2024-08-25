package animals.factoryP;

public class DuckFactory implements AnimalFactory {
	@Override
	public Animal getAnimal() {
		return new Duck();
	}

}
