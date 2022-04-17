package client;

import java.io.*;

import java.util.*;

import adapter.BuildAuto;
import adapter.CreateAuto;
import adapter.StoreAutos;

import model.OptionSet;



 

public class CarModelOptionsIO {

	////////// PROPERTIES //////////
	

	////////// CONSTRUCTORS //////////

	public CarModelOptionsIO() {

		//a1.emptyAuto();
		
	}

	////////// INSTANCE METHODS //////////

	public Object loadPropsFile(String fname) {
		
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(fname));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		
		ArrayList<OptionSet> opset = new ArrayList<OptionSet>();
	
		//int x = 0;
		//int y = 0;
			
		String model = props.getProperty("CarModel");
		String make = props.getProperty("CarMake");
		String year = props.getProperty("CarYear");
		String price = props.getProperty("BasePrice");
		String opt1 = props.getProperty("Option1");
		String opt1a = props.getProperty("OptionValue1a");
		String opt1b = props.getProperty("OptionValue1b");
		String opt1aPrice = props.getProperty("OptionValue1aPrice");
		String opt1bPrice = props.getProperty("OptionValue1bPrice");
		String opt2 = props.getProperty("Option2");
		String opt2a = props.getProperty("OptionValue2a");
		String opt2b = props.getProperty("OptionValue2b");
		String opt2c = props.getProperty("OptionValue2c");
		String opt2aPrice = props.getProperty("OptionValue2aPrice");
		String opt2bPrice = props.getProperty("OptionValue2bPrice");
		String opt2cPrice = props.getProperty("OptionValue2cPrice");
		String opt3 = props.getProperty("Option3");
		String opt3a = props.getProperty("OptionValue3a");
		String opt3b = props.getProperty("OptionValue3b");
		String opt3c = props.getProperty("OptionValue3c");
		String opt3d = props.getProperty("OptionValue3d");
		String opt3e = props.getProperty("OptionValue3e");
		String opt3f = props.getProperty("OptionValue3f");
		String opt3g = props.getProperty("OptionValue3g");
		String opt3h = props.getProperty("OptionValue3h");
		String opt3i = props.getProperty("OptionValue3i");
		String opt3j = props.getProperty("OptionValue3j");
		String opt3aPrice = props.getProperty("OptionValue3aPrice");
		String opt3bPrice = props.getProperty("OptionValue3bPrice");
		String opt3cPrice = props.getProperty("OptionValue3cPrice");
		String opt3dPrice = props.getProperty("OptionValue3dPrice");
		String opt3ePrice = props.getProperty("OptionValue3ePrice");
		String opt3fPrice = props.getProperty("OptionValue3fPrice");
		String opt3gPrice = props.getProperty("OptionValue3gPrice");
		String opt3hPrice = props.getProperty("OptionValue3hPrice");
		String opt3iPrice = props.getProperty("OptionValue3iPrice");
		String opt3jPrice = props.getProperty("OptionValue3jPrice");
		String opt4 = props.getProperty("Option4");
		String opt4a = props.getProperty("OptionValue4a");
		String opt4b = props.getProperty("OptionValue4b");
		String opt4aPrice = props.getProperty("OptionValue4aPrice");
		String opt4bPrice = props.getProperty("OptionValue4bPrice");
		String opt5 = props.getProperty("Option5");
		String opt5a = props.getProperty("OptionValue5a");
		String opt5b = props.getProperty("OptionValue5b");
		String opt5aPrice = props.getProperty("OptionValue5aPrice");
		String opt5bPrice = props.getProperty("OptionValue5bPrice");
		
		
		CreateAuto a1 = new BuildAuto();
		StoreAutos a2 = new BuildAuto();
		a2.addHashLink(make + " " + model + " " + year , a1.emptyAuto());
		a1.setMake(make);
		a1.setModel(model);
		a1.setYear(year);
		//a2.addHashLink(make + " " + model + " " + year , a1.emptyAuto());
		a1.setBasePrice(Float.parseFloat(price));
		opset.add(0,a1.addOptSet());
		opset.add(1,a1.addOptSet());
		opset.add(2, a1.addOptSet());
		opset.add(3, a1.addOptSet());
		opset.add(4, a1.addOptSet());
		a1.setOptSet(opset);
		a1.createOptSize(0, 2);
		a1.createOptSize(1, 3);
		a1.createOptSize(2, 10);
		a1.createOptSize(3, 2);
		a1.createOptSize(4, 2);
		if(opt1 != null)
		a1.setOptSetName(0, opt1);
		if(opt1a != null)
		a1.setOptName(0, 0, opt1a);
		if(opt1aPrice != null)
		a1.setOptPrice(0, 0, Float.parseFloat(opt1aPrice));
		if(opt1b != null)
		a1.setOptName(0, 1, opt1b);
		if(opt1bPrice != null)
		a1.setOptPrice(0, 1, Float.parseFloat(opt1bPrice));
		if(opt2 != null)
		a1.setOptSetName(1, opt2);
		if(opt2a != null)
		a1.setOptName(1, 0, opt2a);
		if(opt2aPrice != null)
		a1.setOptPrice(1, 0, Float.parseFloat(opt2aPrice));
		if(opt2b != null)
		a1.setOptName(1, 1, opt2b);
		if(opt2bPrice != null)
		a1.setOptPrice(1, 1, Float.parseFloat(opt2bPrice));
		if(opt2c != null)
		a1.setOptName(1, 2, opt2c);
		if(opt2cPrice != null)
		a1.setOptPrice(1, 2, Float.parseFloat(opt2cPrice));
		if(opt3 != null)
		a1.setOptSetName(2, opt3);
		if(opt3a != null)
		a1.setOptName(2, 0, opt3a);
		if(opt3aPrice != null)
		a1.setOptPrice(2, 0, Float.parseFloat(opt3aPrice));
		if(opt3b != null)
		a1.setOptName(2, 1, opt3b);
		if(opt3bPrice != null)
		a1.setOptPrice(2, 1, Float.parseFloat(opt3bPrice));
		if(opt3c != null)
		a1.setOptName(2, 2, opt3c);
		if(opt3cPrice != null)
		a1.setOptPrice(2, 2, Float.parseFloat(opt3cPrice));
		if(opt3d != null)
		a1.setOptName(2, 3, opt3d);
		if(opt3dPrice != null)
		a1.setOptPrice(2, 3, Float.parseFloat(opt3dPrice));
		if(opt3e != null)
		a1.setOptName(2, 4, opt3e);
		if(opt3ePrice != null)
		a1.setOptPrice(2, 4, Float.parseFloat(opt3ePrice));
		if(opt3f != null)
		a1.setOptName(2, 5, opt3f);
		if(opt3fPrice != null)
		a1.setOptPrice(2, 5, Float.parseFloat(opt3fPrice));
		if(opt3g != null)
		a1.setOptName(2, 6, opt3g);
		if(opt3gPrice != null)
		a1.setOptPrice(2, 6, Float.parseFloat(opt3gPrice));
		if(opt3h != null)
		a1.setOptName(2, 7, opt3h);
		if(opt3hPrice != null)
		a1.setOptPrice(2, 7, Float.parseFloat(opt3hPrice));
		if(opt3i != null)
		a1.setOptName(2, 8, opt3i);
		if(opt3iPrice != null)
		a1.setOptPrice(2, 8, Float.parseFloat(opt3iPrice));
		if(opt3j != null)
		a1.setOptName(2, 9, opt3j);
		if(opt3jPrice != null)
		a1.setOptPrice(2, 9, Float.parseFloat(opt3jPrice));
		if(opt4 != null)
		a1.setOptSetName(3, opt4);
		if(opt4a != null)
		a1.setOptName(3, 0, opt4a);
		if(opt4aPrice != null)
		a1.setOptPrice(3, 0, Float.parseFloat(opt4aPrice));
		if(opt4b != null)
		a1.setOptName(3, 1, opt4b);
		if(opt4bPrice != null)
		a1.setOptPrice(3, 1, Float.parseFloat(opt4bPrice));
		if(opt5 != null)
		a1.setOptSetName(4, opt5);
		if(opt5a != null)
		a1.setOptName(4, 0, opt5a);
		if(opt5aPrice != null)
		a1.setOptPrice(4, 0, Float.parseFloat(opt5aPrice));
		if(opt5b != null)
		a1.setOptName(4, 1, opt5b);
		if(opt5bPrice != null)
		a1.setOptPrice(4, 1, Float.parseFloat(opt5bPrice));
		
		
		/*if(opt1.equalsIgnoreCase("Option1")) 
		{}
		else if(opt1a.equalsIgnoreCase("OptionValue1a")) {}
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		else if(opt1b.equalsIgnoreCase("OptionValue1b")) { y++; }
		if(opt2.equals("Option2"))
			x++;
		if(opt1.equals("Option3"))
			x++;
		if(opt2.equals("Option4"))
			x++;
		if(opt1.equals("Option5"))
			x++;
		if(opt2.equals("Option6"))
			x++;
		if(opt1.equals("Option7"))
			x++;
		if(opt2.equals("Option8"))
			x++;*/
		
		

		return props;
	
	}

	public Object loadTextFile(String fname) {
		StringBuffer sbuff = new StringBuffer();
		
		try {
			BufferedReader buff = new BufferedReader(new FileReader(fname));
			//props.load((new FileInputStream(fname)));
			boolean eof = false;
			int counter = 0;
			while (!eof) {
				String line = buff.readLine();
				if (line == null)
					eof = true;
				else {
					if (counter == 0)
						sbuff.append(line);
					else
						sbuff.append("\n" + line);
				}
				
				counter++;
			}
			
			buff.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Error in file directory ... ");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("Error reading file from directory ... ");
			System.exit(1);
		}
		
		
		

		return sbuff;
	}

}

