package pizzastore.factoryP;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if(type.equals("pepperoni")) {
			pizza=new PepperoniPizza();
		}
	    if(type.equals("veggie")) {
			pizza=new VeggiePizza();
		}
		return pizza;
	}
}
