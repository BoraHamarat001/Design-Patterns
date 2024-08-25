package animals.factoryP;

public class main {

	public static void main(String[] args) {
		AnimalFactory factory_duck=new DuckFactory();
		AnimalFactory factory_cat=new CatFactory();
		Zoo zoo1=new Zoo(factory_duck);
		zoo1.getAnimal();
		Zoo zoo2=new Zoo(factory_cat);
		zoo2.getAnimal();
		
		
	}

}
