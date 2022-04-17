package adapter;

import util.*;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;



import client.DefaultSocketClient;
import exception.AutoException;
import model.*;
import scale.EditOptions;
import server.DefaultServerSocket;

public abstract class ProxyAutomobile {

	
	private static Automobile a1;
	private static MyLHM<Automobile> lhm = new MyLHM<Automobile>();
	private static FileIO fn = new FileIO();
	
	// Basic Auto Methods
	public void buildAuto() throws AutoException {
		System.out.println("Please enter the file name you want to store for auto configuration: ");
		Scanner input = new Scanner(System.in);
		String fname = input.nextLine();
		fn.setFileName(fname);
		a1 = fn.buildAutoObject(fname);
		lhm.addLink(a1.getMake() + " " + a1.getModel() + " " + a1.getYear(), a1);
	}
	
	public void buildAuto(String fname) throws AutoException {
		fn.setFileName(fname);
		a1 = fn.buildAutoObject(fname);
		lhm.addLink(a1.getMake() + " " + a1.getModel() + " " + a1.getYear(), a1);
	}
	
	public void writeData(Automobile a1) {
		
		System.out.println("Please enter the file name you want to store for auto configuration: ");
		Scanner input = new Scanner(System.in);
		String fname = input.nextLine();
		try {
			fn.writeData(a1, fname);
		} catch (AutoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getFileName() { return fn.getFileName(); }
	
	public void readData() {
		
		System.out.println("Please enter the file name you want to store for auto configuration: ");
		Scanner input = new Scanner(System.in);
		String fname = input.nextLine();

		fn.setFileName(fname);
		try {
			a1 = fn.readData(fname);
		} catch (AutoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lhm.addLink(a1.getMake() + " " + a1.getModel() + " " + a1.getYear(), a1);
	}
	
	public OptionSet addOptSet() { return a1.addOptSet(); }
	
	public void setOptSet(ArrayList<OptionSet> opset) { a1.setOptSet(opset); }
	
	public Automobile emptyAuto() { 
		//lhm.addLink(a1.getMake() + " " + a1.getModel() + " " + a1.getYear(), a1);
		a1 = new Automobile();
		return a1; 
	}
	
	public void createOptSize(int x, int y) { a1.createOptSize(x, y); }
	
	public void setMake(String make) {	a1.setMake(make); }
	public void setModel(String model) { a1.setModel(model); }
	public void setYear(String year) { a1.setYear(year); }
	public void setBasePrice(float price) { a1.setBasePrice(price); }
	public void setOptSetName(int x, String setName) { a1.setOptSetName(x, setName); }
	public void setOptName(int x, int y, String optName) { a1.setOptName(x, y, optName); }
	public void setOptPrice(int x, int y, float optPrice) { a1.setOptPrice(x, y, optPrice); }
	public void getMake() { a1.getMake(); }
	public void getModel() { a1.getModel(); }
	public void getYear() { a1.getYear(); }
	public void getBasePrice() { a1.getBasePrice(); }
	public void getOptSetName(int x) { a1.getOptSetName(x); }
	public void getOptName(int x, int y) { a1.getOptName(x, y); }
	public void getOptPrice(int x, int y) { a1.getOptPrice(x, y); }
	
	public void printAuto() throws AutoException {
		a1.printData();
	}
	
	public void updateOptSetName(String fname, String opsetName, String newName) throws AutoException {
		fn.setFileName(fname);
		a1.updateOptSetName(opsetName, newName);
		fn.writeData(a1, fn.getFileName());
	}
	
	public void updateOptPrice(String fname, String setName, String optName, float price) throws AutoException {
		fn.setFileName(fname);
		a1.updateOptPrice(setName, optName, price);
		fn.writeData(a1, fn.getFileName());
	}
	
	// Selecting Auto choice methods

	public void setOptionChoice() {
		System.out.println("List of Option Sets to choose from: ");
		a1.printOptSet();
		
		System.out.println("Enter the corresponding Option Set NAME you would like to choose from.");
		Scanner input = new Scanner(System.in);
		String setName = input.nextLine();
		
		System.out.println("List of Options from set '" + setName + "' to choose from: ");
		for(int i = 0; i < a1.getOptSetLen(); i++)
		{
			if(a1.getOptSetName(i).equalsIgnoreCase(setName))
				for(int j = 0; j < a1.getOptionLen(i); j++)
				{
					System.out.println("[" + j + "] " + a1.getOptName(i, j));
				}
		}
		System.out.println("Enter the corresponding Option NAME you would like to make your choice.");
		Scanner input1 = new Scanner(System.in);
		String optName = input1.nextLine();
		
		a1.setOptionChoice(setName, optName);
	}
	
	public void printConfiguredAuto() {
		
		a1.printConfiguredAuto();
		
	}
	
	public void getOptionChoice() {
		
		System.out.println("Enter an option set name, to return the corresponding option choice: ");
		Scanner input = new Scanner(System.in);
		String setName = input.nextLine();
		a1.getOptionChoice(setName);
		
	}
	public void getOptionChoicePrice() {
		
		System.out.println("Enter an option set name, to return the corresponding option choice price: ");
		Scanner input = new Scanner(System.in);
		String setName = input.nextLine();
		a1.getOptionChoicePrice(setName);
		
	}
	public void getTotalPrice() {
		a1.getTotalPrice();
	}
	
	public Automobile selectAuto(String key) {
		
		return lhm.findLink(key);
		
	}

	
	
	// LinkedHashMap Methods Start Here:
	public void addHashLink(String key, Automobile a1) {
		lhm.addLink(key, a1); 
	}
	public void removeHashLink(String key) {
		lhm.removeLink(key);
	}
	public Automobile findHashLink(String key) {
		return lhm.findLink(key);
	}
	public void deleteHashMap() {
		lhm.deleteMap();
	}
	public int getSize() {
		return lhm.getSize();
	}
	public Collection<Automobile> getValues() {
		return lhm.getValues();
	}
	public void printLinkedHashMap() {
		lhm.printMap();
	}
	
	// Threading Methods are implemented into the EditOps module below
	public void edit(int x) {
		
		EditOptions edit = new EditOptions(x, a1);
		
		edit.run();
	}
	public void ops() {
		
		EditOptions edit = new EditOptions();
		
		edit.ops();
	}
	public void updateOptName(String auto, String optSet, String opt, String newOpt) {
		
		
		EditOptions edit = new EditOptions(a1);
		
		
		edit.updateOptName(a1.getMake(), a1.getModel(), a1.getYear(), optSet, opt, newOpt);
		
	}
	
	public void updateOptPrice() {
		
		EditOptions edit = new EditOptions(a1);
		
		edit.updateOptPrice();
	}
	
	public void create() {
		
		EditOptions edit = new EditOptions();
		
		edit.create();
	}
	
    public void delete() {
    	
    	EditOptions edit = new EditOptions();
    	
    	edit.delete();
    }
    
    public void updateOptName1(String auto, String optSet, String opt, String newOpt) {
		
		EditOptions edit = new EditOptions(a1);
		
		edit.updateOptName1(a1.getMake(), a1.getModel(), a1.getYear(), optSet, opt, newOpt);
		
	}
	
	public void updateOptPrice1() {
		
		EditOptions edit = new EditOptions();
		
		edit.updateOptPrice1();
	}
	
	public void create1() {
		
		EditOptions edit = new EditOptions();
		
		edit.create1();
	}
	
    public void delete1() {
    	
    	EditOptions edit = new EditOptions();
    	
    	edit.delete1();
    }
    
    // Client and server operations
    public void serve(int port) {
    	
    	DefaultServerSocket server = new DefaultServerSocket(port);
    	DefaultSocketClient client = new DefaultSocketClient("127.0.0.1", server.getPort());
    	
    	server.start();
    	client.start();
    	
    
    	
    }
  
    
}
