package pizzaStore2.abstractFactoryP;

public class LAPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String item) {
		 if (item.equals("cheese")) {
	    	 return new LAStyleCheesePizza();
	     }
	     else if (item.equals("pepperoni")) {
	    	 return new LAStylePepperoniPizza();
		 } 
	     else return null;
	}
}
