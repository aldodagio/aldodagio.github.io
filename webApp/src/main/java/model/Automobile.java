package model;

import java.io.*;
import java.util.ArrayList;

import model.OptionSet.Option;


public class Automobile implements Serializable {
	
	// Properties of automotive class.
	private String make;
	private String model;
	private double basePrice;
	private String year;
	private ArrayList<OptionSet> opset;
	private ArrayList<Option> choice;
	
	// Methods for desired object behaviors.
	// Constructors
	public Automobile() {
		this.opset = new ArrayList<OptionSet>();
		
		this.choice = new ArrayList<OptionSet.Option>();
		
		for(int i = 0; i < 5; i++)
		{
			this.opset.add(i, new OptionSet());
		}
		
		for(int j = 0; j < 5; j++)
	{
			OptionSet op = new OptionSet();
			choice.add(j, op.new Option());
	}
	
	
	}
	public Automobile(String make, String model, double basePrice, int size)
	{
		this.make = make;
		this.model = model;
		this.basePrice = basePrice;

		this.opset = new ArrayList<OptionSet>();
		this.choice = new ArrayList<OptionSet.Option>();
		for(int i = 0; i < size; i++)
		{
			this.opset.add(i, new OptionSet());
		}
		
		for(int j = 0; j < size; j++)
	{
			OptionSet op = new OptionSet();
			choice.add(j, op.new Option());
	}
	}
	
	public OptionSet addOptSet() { return new OptionSet(); }
	
	// getters and setters
	public String getMake() { return make; } //
	public void setMake(String make) { this.make = make; } //
	public String getModel() { return model; } //
	public void setModel(String model) { this.model = model; } //
	public double getBasePrice() { return basePrice; } //
	public void setBasePrice(double basePrice) { this.basePrice = basePrice; } //
	public String getYear() { return year; } 
	public void setYear(String year) { this.year = year; }
	public String getAuto() { return this.make + " " + this.model + " " + this.year; }
	public OptionSet getOneOptSet(int x) { return opset.get(x); } //
	public ArrayList<OptionSet> getOptSet() { return opset; }
	public int getOptSetLen() { return opset.size(); }
	public int getOptionLen(int x) { return opset.get(x).getOptLen(); }
	public void setOneOptSet(OptionSet set, int x) { opset.set(x, set); }
	public void setOptSet(ArrayList<OptionSet> opset) { this.opset = opset; }
	public String getOptSetName(int x) { return this.opset.get(x).getSetName(); }
	public void setOptSetName(int x, String setName) { this.opset.get(x).setSetName(setName); }
	public String getOptName(int x, int y) { return opset.get(x).getOptName(y); }
	public void setOptName(int x, int y, String optName) { this.opset.get(x).setOptName(y, optName); }
	public float getOptPrice(int x, int y) { return opset.get(x).getOptPrice(y); }
	public void setOptPrice(int x, int y, float optPrice) { this.opset.get(x).setOptPrice(y, optPrice); }
	public void setOneOptSetOpt(int x, int y, String name, float price) { this.opset.get(x).buildOption(y, name, price); }
	public void createOptSize(int x, int y) { this.opset.get(x).createOptSize(y); }
	public String getOptionChoice(String setName) {
		String choiceName = null;
		OptionSet temp = new OptionSet();
		temp.setSetName(setName);
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(temp.getSetName()))
			{
				setName = opset.get(i).getSetName();
		for(int j = 0; j < opset.get(i).getOptLen(); j++)
		{
			if(choice.get(i).getName().equalsIgnoreCase(opset.get(i).getOptName(j)))
			{
				choiceName = choice.get(i).getName(); 
			}
		}
			}
		}
			//System.out.println(setName + ": " + choiceName);
			
			return choiceName;
		}
	public float getOptionChoicePrice(String setName) {
		float choicePrice = 0;
		OptionSet temp = new OptionSet();
		temp.setSetName(setName);
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(temp.getSetName()))
		for(int j = 0; j < opset.get(i).getOptLen(); j++)
		{
			if(choice.get(i).getName().equalsIgnoreCase(opset.get(i).getOptName(j)))
			{
				choicePrice = choice.get(i).getPrice(); 
			}
		}
		}
		//System.out.println("$" + choicePrice);
		return choicePrice;
		}
	public void setOptionChoice(String setName, String optName) { 
		OptionSet temp = new OptionSet();
		temp.setSetName(setName);
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(temp.getSetName()))
			for(int j = 0; j < opset.get(i).getOptLen(); j++)
			{
				if(opset.get(i).getOptName(j).equalsIgnoreCase(optName)) 
					choice.add(i, opset.get(i).getOneOpt(j));
			}
		}
	}
	
	public void printConfiguredAuto() {
		
		System.out.println("Here are the specifications you customized for your new " + getAuto() + ".");
		System.out.println("We hope you enjoyed your experience! :)");
		
		for(int i = 0; i < opset.size(); i++)
		{
			System.out.println("Specification #:" +i+ "" + opset.get(i).getSetName());
			System.out.println("Choice #:" +i+ "" + choice.get(i).getName());
			System.out.println("Price $" + choice.get(i).getPrice());
		}
	}
	
	public float getTotalPrice() { 
		float totalPrice = 0;
		for(int i = 0; i < choice.size(); i++)
		{
			totalPrice += choice.get(i).getPrice();
		}
		totalPrice += basePrice;
		
		//System.out.println("Total Price of Auto: $" + totalPrice);
		return totalPrice;
		}
	public int getOptSetIndex(String optSetName) {
		
		int index = 0;
		
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(optSetName))
			{
				index = i;
			}
		}
		return index;
	}
	public int getOptIndex(String optSetName, String optName) {
		int index = 0;
		
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(optSetName))
			for(int j = 0; j < opset.get(i).getOptLen(); j++ )
			{
				if(opset.get(i).getOptName(j).equalsIgnoreCase(optName))
				{
					index = j;
				}
			}
		}
		return index;
	}
	public void printMake() { System.out.println(getMake()); }
	public void printModel() { System.out.println(getModel()); }
	public void printBasePrice() { System.out.println(getBasePrice()); }
	public void printMakeModel() { System.out.println(getMake() + " " + getModel());  }
	public void printOptSet() { 
		for(int i = 0; i < opset.size(); i++)
		{
			System.out.println("[" + i + "] " + opset.get(i).getSetName());
		}
		}
	public void printOneOptSet(int x) { 
		//System.out.println(getOneOptSet(x));
		
			for(int j = 0; j < opset.get(x).getOptLen(); j++)
			{
			System.out.println("[" + j + "] " + opset.get(x).getOptName(j));
			}
		
		}
	public void printOneOpt(int x, int y) {
		System.out.println(opset.get(x).getOneOpt(y));
		
		}
	public void printData() 
	{ 
		System.out.println(getMake() + " " + getModel() + " " + getYear());
		
		for(int i = 0; i < opset.size(); i++)
		{
			System.out.println("Option Set: " + opset.get(i).getSetName());
			for(int j = 0; j < opset.get(i).getOptLen(); j++)
			{
				System.out.println(opset.get(i).getOptName(j));
				System.out.println("Price: " + opset.get(i).getOptPrice(j));
			}
		}
			
	}
	public void updateOptSetName(String setName, String newOptSetName) { 
		OptionSet op = null;
			
			for(int i = 0; i < opset.size(); i++)
			{
				if(opset.get(i).getSetName().equals(setName))
					op = opset.get(i);
			}
			
			op.setSetName(newOptSetName);
		}
	public void updateOptName(String setName, String optName, String newOptName) {
		
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(setName))
			{
			 for(int j = 0; j < opset.get(i).getOptLen(); j++)
			 {
				 if(opset.get(i).getOptName(j).equalsIgnoreCase(optName))
					 opset.get(i).setOptName(j, newOptName);
			 }
			}
		}
		
	}
	public void updateOptPrice(String setName, String optName, float newOptPrice) {
		
		for(int i = 0; i < opset.size(); i++)
		{
			if(opset.get(i).getSetName().equalsIgnoreCase(setName))
			{
			 for(int j = 0; j < opset.get(i).getOptLen(); j++)
			 {
				 if(opset.get(i).getOptName(j).equalsIgnoreCase(optName))
					 opset.get(i).setOptPrice(j, newOptPrice);
			 }
			}
		}
		
	}
	public void deleteOptSet(int x) {
			ArrayList<OptionSet> opArr = new ArrayList<OptionSet>(opset.size() - 1);
			for(int i = 0; i < opset.size() - 1; i++)
			{
				if(opset.get(i) != opset.get(x))
					opArr.set(i, opset.get(i));
			}
			setOptSet(opArr);
	}
	
	public void deleteOpt(int x, int y) {
			ArrayList<OptionSet.Option> opArr = new ArrayList<OptionSet.Option>();
			for(int i = 0; i < getOptionLen(x)-1; i++)
			{
				if(opset.get(x).getOneOpt(i) != opset.get(x).getOneOpt(y))
					opArr.set(i, opset.get(x).getOneOpt(i));
			}
			opset.get(x).setOpt(opArr);
	}
}
