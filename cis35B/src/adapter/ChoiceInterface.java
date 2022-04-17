package adapter;

import model.Automobile;

public interface ChoiceInterface {

	public void setOptionChoice();
	public void getOptionChoice();
	public void printConfiguredAuto();
	public void getOptionChoicePrice();
	public void getTotalPrice();
	public Automobile selectAuto(String key);
	
}
