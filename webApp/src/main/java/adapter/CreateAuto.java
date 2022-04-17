package adapter;

import java.util.ArrayList;

import exception.AutoException;
import model.Automobile;
import model.OptionSet;

public interface CreateAuto {

	public void buildAuto() throws AutoException;
	public void readData();
	public void buildAuto(String fname) throws AutoException;
	public void writeData(Automobile a1);
	public String getFileName();
	public OptionSet addOptSet();
	public void setOptSet(ArrayList<OptionSet> opset);
	public void createOptSize(int x, int y);
	public void printAuto() throws AutoException;
	public void setMake(String make);
	public void setModel(String model);
	public void setYear(String year);
	public void setBasePrice(float price);
	public void setOptSetName(int x, String setName);
	public void setOptName(int x, int y, String optName);
	public void setOptPrice(int x, int y, float optPrice);
	public void getMake();
	public void getModel();
	public void getYear();
	public void getBasePrice();
	public void getOptSetName(int x);
	public void getOptName(int x, int y);
	public void getOptPrice(int x, int y);
	public Automobile emptyAuto();
	
}
