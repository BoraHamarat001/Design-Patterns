package pizzaStore2.abstractFactoryP;

public class LAStylePepperoniPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing la style pepperoni pizza");
 	}
   @Override
	public void cut() {
	   System.out.println("Cutting  la style pepperoni pizza");		
	}
   @Override
	public void bake() {
	   System.out.println("Baking  la style pepperoni pizza");
	}
   @Override
	public void box() {
	   System.out.println("Boxing la style pepperoni pizzas");
	}

}
