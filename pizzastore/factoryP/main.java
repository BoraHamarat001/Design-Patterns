package pizzastore.factoryP;

public class main {

	public static void main(String[] args) {
		SimplePizzaFactory factory1=new SimplePizzaFactory();
		PizzaStore nyStore=new PizzaStore(factory1);
		nyStore.orderPizza("pepperoni");
		PizzaStore chiagoStore=new PizzaStore(factory1);
		chiagoStore.orderPizza("veggie");
		PizzaStore californiaStore=new PizzaStore(factory1);
		

	}

}
