package model;

import java.io.*;
import java.util.ArrayList;

public class OptionSet implements Serializable {
	private String setName;
	private ArrayList<Option> opt;
	private Option choice;
	
	protected OptionSet() {
		
		this.opt = new ArrayList<Option>();
	}
	protected OptionSet(String name, int size) {
		this.setName = name;
		this.opt = new ArrayList<Option>();
		for(int i = 0; i < size; i++)
		{
			opt.add(i, new Option());
		}
	}
	protected String getSetName() 
	{ 
		return this.setName;
	}
	protected void setSetName(String setName) { this.setName = setName; }
	protected Option getOneOpt(int x) { return opt.get(x); }
	protected ArrayList<Option> getOpt() { return opt; }
	protected void setOneOpt(Option opt, int x) { this.opt.set(x, opt); }
	protected void setOpt(ArrayList<Option> opt) { this.opt = opt; }
	protected int getOptLen() { return opt.size(); }
	protected void buildOption(int x, String name, float price) {}
	protected String getOptName(int x) { return opt.get(x).getName(); }
	public void setOptName(String optName) {
		Option op = new Option();
		op.setName(optName);
	}
	protected void setOptName(int x, String newOptName) { this.opt.get(x).setName(newOptName); }
	protected float getOptPrice(int x) { return opt.get(x).getPrice(); }
	protected void setOptPrice(int x, float newOptPrice) { 
			this.opt.get(x).setPrice(newOptPrice);
		}
	public void createOptSize(int x) { 
		this.opt = new ArrayList<Option>();
		for(int i = 0; i < x; i++)
		{
			opt.add(i, new Option());
		}
		}
	//protected Option getOptionChoice() { return; }
	protected void printData() {

		for(int i = 0; i < opt.size(); i++)
		{
			System.out.println(opt.get(i).getName());
			System.out.println(opt.get(i).getPrice());
		}
	}
	protected void printOneOpt() {}

	
	 class Option implements Serializable {
		private String name;
		private float price;
		
		protected Option() {}
		protected Option(String name, float price) {
			this.name = name;
			this.price = price;
		}
		protected String getName() { return name; }
		protected void setName(String name) { this.name = name; }
		protected float getPrice() { return price; }
		protected void setPrice(float price) { this.price = price; }
		protected void printData() {
			for(int i = 0; i < opt.size(); i++)
			{
				System.out.println(opt.get(i).getName());
				System.out.println(opt.get(i).getPrice());
			}
		}
	}


}
