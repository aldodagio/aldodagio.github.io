package scale;

import java.util.Scanner;

import adapter.BuildAuto;
import adapter.ProxyAutomobile;
import adapter.StoreAutos;
import model.Automobile;





public class EditOptions extends ProxyAutomobile implements Runnable {
	
	int x;
	int threadno;
	Automobile a1;
	
	public EditOptions() {}
	
	public EditOptions(Automobile a1) {
		this.a1 = a1;
	}
	
	public EditOptions(int x, Automobile a1) {
		
		this.x = x;
		this.a1 = a1;
		
	}
	
	
	@Override
	public void run() {
	
	switch (x) {
	case 0:
		System.out.println("Start thread " + threadno + " UpdateOptName");
		break;
	case 1:
		System.out.println("Start thread " + threadno + " UpdateOptPrice");
		break;
	case 2:
		System.out.println("Start thread " + threadno + " UpdateOptName");
		break;
	case 3:
		System.out.println("Start thread " + threadno + " UpdateOptName");
		break;
	}
	ops();
	System.out.println("Stopping thread " + threadno);
	
}
	
	public void ops() {
		switch (x) {
		case 0:
			updateOptName(a1.getMake(), a1.getModel(), a1.getYear(), "color", "blu","blue");
			break;
		case 1:
			updateOptPrice();
			break;
		case 2:
			delete();
			break;
		case 3:
			create();
			break;
		}
	}
	
	public synchronized void updateOptName(String make, String model, String year, String optionSet, String option, String newOpt) {
		
		
		StoreAutos lhm = new BuildAuto();
		
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
				System.out.println("Edit the option name accordingly (Ex. 'blu' --> 'blue' ): ");

				lhm.findHashLink(make + model + year).setOptName(i, j, newOpt); 
				
			 
				System.out.println("The new option name is set to the following: " + lhm.findHashLink(make + model + year).getOptName(i, j));
				
				}
			}
		}
		
		
	}
	
	public synchronized void updateOptPrice() {
		
		float newOptionPrice = 0;
		
		System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to edit (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the option name from the option set that you would like to change the price (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
				System.out.println("Edit the option price accordingly (Ex. '0' --> '100.00' ): ");
				Scanner newOpt = new Scanner(System.in);
				newOptionPrice = newOpt.nextFloat();
				lhm.findHashLink(make + model + year).setOptPrice(i, j, newOptionPrice);
				System.out.println("The new option price is set to the following: " + lhm.findHashLink(make + model + year).getOptPrice(i, j));
				newOpt.close();
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();

	}
	
	public synchronized void create() {
		System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to add an option (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the new option name you would like to add (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i) + 1; j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(null))
				{
					lhm.findHashLink(make + model + year).setOneOptSetOpt(i, j, option, 0);
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();
	}
	
    public synchronized void delete() {
    	System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to delete an option (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the option name from the option set that you would like to delete (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
					lhm.findHashLink(make + model + year).deleteOpt(i, j);
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();
	}
    
public void updateOptName1(String make, String model, String year, String optionSet, String option, String newOpt) {
		
		
		
		
		StoreAutos lhm1 = new BuildAuto();
		
		
		for(int i = 0; i < lhm1.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm1.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm1.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm1.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
				System.out.println("Edit the option name accordingly (Ex. 'blu' --> 'blue' ): ");
				
				lhm1.findHashLink(make + model + year).setOptName(i, j, newOpt);
				System.out.println("The new option name is set to the following: " + lhm1.findHashLink(make + model + year).getOptName(i, j));
				
			
				}
			}
		}
		
	
	}
	
	public void updateOptPrice1() {
		
		float newOptionPrice = 0;
		
		System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to edit (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the option name from the option set that you would like to change the price (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
				System.out.println("Edit the option price accordingly (Ex. '0' --> '100.00' ): ");
				Scanner newOpt = new Scanner(System.in);
				newOptionPrice = newOpt.nextFloat();
				lhm.findHashLink(make + model + year).setOptPrice(i, j, newOptionPrice);
				System.out.println("The new option price is set to the following: " + lhm.findHashLink(make + model + year).getOptPrice(i, j));
				newOpt.close();
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();

	}
	
	public void create1() {
		System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to add an option (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the new option name you would like to add (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i) + 1; j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(null))
				{
					lhm.findHashLink(make + model + year).setOneOptSetOpt(i, j, option, 0);
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();
	}
	
    public void delete1() {
    	System.out.println("Enter the make of the vehicle you are searching for within the linkedhashmap (Ex. 'Ford Focus'): ");
		Scanner input = new Scanner(System.in);
		String make = input.nextLine();
		System.out.println("Enter the model of the vehicle you are searching for within the linkedhashmap (Ex. 'Wagon ZTW'): ");
		Scanner input1 = new Scanner(System.in);
		String model = input1.nextLine();
		System.out.println("Enter the year of the vehicle you are searching for within the linkedhashmap (Ex. 1998-Present): ");
		Scanner input2 = new Scanner(System.in);
		String year = input2.nextLine();
		
		StoreAutos lhm = new BuildAuto();
		
		System.out.println("Enter the option set name from which you would like to delete an option (Ex. 'color'): ");
		Scanner opset = new Scanner(System.in);
		String optionSet = opset.nextLine();
		System.out.println("Enter the option name from the option set that you would like to delete (Ex. 'blu'): ");
		Scanner opt = new Scanner(System.in);
		String option = opt.nextLine();
		
		for(int i = 0; i < lhm.findHashLink(make + model + year).getOptSetLen(); i++)
		{
			if(lhm.findHashLink(make + model + year).getOptSetName(i).equalsIgnoreCase(optionSet))
			for(int j = 0; j < lhm.findHashLink(make + model + year).getOptionLen(i); j++)
			{
				if(lhm.findHashLink(make + model + year).getOptName(i, j).equalsIgnoreCase(option))
				{
					lhm.findHashLink(make + model + year).deleteOpt(i, j);
				}
			}
		}
		input.close();
		input1.close();
		input2.close();
		opset.close();
		opt.close();
	}
    
    
}
		
	
	
	


