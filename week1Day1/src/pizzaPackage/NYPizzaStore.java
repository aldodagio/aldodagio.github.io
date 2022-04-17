package pizzaPackage;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("cheese"))
			return new NYStyleCheesePizza();
		else if(type.equalsIgnoreCase("pepperoni"))
			return new NYStylePepperoniPizza();
		return null;
	}

}
