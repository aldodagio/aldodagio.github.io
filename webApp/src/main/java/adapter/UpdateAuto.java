package adapter;

import exception.AutoException;

public interface UpdateAuto {
	
	public void updateOptSetName(String fname, String opsetName, String newName) throws AutoException;
	public void updateOptPrice(String fname, String optName, String option, float newPrice) throws AutoException;

}
