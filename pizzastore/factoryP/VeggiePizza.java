package pizzastore.factoryP;

public class VeggiePizza implements Pizza{
 public VeggiePizza() {}
 @Override
	public void prepare() {
		System.out.println("Preparing veggie pizza");
 	}
   @Override
	public void cut() {
	   System.out.println("Cutting veggie pizza");		
	}
   @Override
	public void bake() {
	   System.out.println("Baking veggie pizza");
	}
   @Override
	public void box() {
	   System.out.println("Boxing veggie pizza");
	}
}
