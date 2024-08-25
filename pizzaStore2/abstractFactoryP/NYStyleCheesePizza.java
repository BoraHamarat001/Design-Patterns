package pizzaStore2.abstractFactoryP;

public class NYStyleCheesePizza implements Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing ny style cheese pizza");
 	}
   @Override
	public void cut() {
	   System.out.println("Cutting  ny style cheese pizza");		
	}
   @Override
	public void bake() {
	   System.out.println("Baking  ny style cheese pizza");
	}
   @Override
	public void box() {
	   System.out.println("Boxing  ny style cheese pizzas");
	}

}
