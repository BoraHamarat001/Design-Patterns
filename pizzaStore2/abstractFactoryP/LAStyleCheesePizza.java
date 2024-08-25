package pizzaStore2.abstractFactoryP;

public class LAStyleCheesePizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing la style cheese pizza");
 	}
   @Override
	public void cut() {
	   System.out.println("Cutting  la style cheese pizza");		
	}
   @Override
	public void bake() {
	   System.out.println("Baking la style cheese pizza");
	}
   @Override
	public void box() {
	   System.out.println("Boxing la style cheese pizzas");
	}


}
