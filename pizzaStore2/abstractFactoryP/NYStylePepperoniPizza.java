package pizzaStore2.abstractFactoryP;

public class NYStylePepperoniPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing ny style pepperoni pizza");
 	}
   @Override
	public void cut() {
	   System.out.println("Cutting  ny style pepperoni pizza");		
	}
   @Override
	public void bake() {
	   System.out.println("Baking  ny style pepperoni pizza");
	}
   @Override
	public void box() {
	   System.out.println("Boxing  ny style pepperoni pizzas");
	}

}
