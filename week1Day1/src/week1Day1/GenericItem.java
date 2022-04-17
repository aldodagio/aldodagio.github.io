package week1Day1;

public class GenericItem {

	private String itemName;
	private int itemQuantity;
	
	public void setName(String newName) { itemName = newName; }
	public void setQuantity(int newQty) { itemQuantity = newQty; }
	public String getName() { return itemName; }
	public int getQuantity() { return itemQuantity; }
	public void printItem() { System.out.println("item name: " + itemName + " item quantity: " + itemQuantity); }
	
}
