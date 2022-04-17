package pizzaPackage;

public class Main {
	public static void main(String[] args) {
		PizzaStore myStore = new NYPizzaStore();
		Pizza PepperoniPizza = myStore.orderPizza("pepperoni");
	}
}
