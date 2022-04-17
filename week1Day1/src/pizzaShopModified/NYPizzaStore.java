package pizzaShopModified;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese"))
			return new NYStyleCheesePizza();
		else if(item.equals("pepperoni"))
			return new NYStylePepperoniPizza();
		else if(item.equalsIgnoreCase("veggie"))
			return new NYStyleVeggiePizza();
		else if(item.equalsIgnoreCase("clam"))
			return new NYStyleClamPizza();
		else return null;
	}
	

}
