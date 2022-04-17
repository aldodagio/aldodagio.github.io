package client;

import model.*;
import java.util.*;

import adapter.BuildAuto;
import adapter.CreateAuto;
import adapter.StoreAutos;


public class SelectCarOptions {

	////////// PROPERTIES //////////
	private Scanner in = new Scanner(System.in);
	private CreateAuto a1 = new BuildAuto();
	private StoreAutos a2 = new BuildAuto();

	////////// CONSTRUCTORS //////////

	public SelectCarOptions() {

		
		
	}

	////////// INSTANCE METHODS //////////

	public void configureAuto(Object obj) {
		
		
		/*System.out.println("Please enter a file name to start configuring your auto object.");
		String fname = in.nextLine();
		String lhm = (String) obj;
		a1.writeData(a2.findHashLink(lhm));
		a1.readData(fname);*/
		//obj = a2.findHashLink(lhm);
		//a1.setMake(((Automobile) obj).getMake());
		//a1.setModel(a2.findHashLink((String) obj).getModel());
		//a1.setYear(a2.findHashLink((String) obj).getYear());
		/*System.out.println("You chose to configure " + select.selectAuto(a1.getAuto() + ".")); // this should be accessing and printing the selected auto from the list in linked hash map
		System.out.println("What would you like to choose for option set name " + select.selectAuto(a1.getOptSetName(1) + " ?"));
		System.out.println(select.selectAuto(a1.getOptName(1, 0)));
		System.out.println(select.selectAuto(a1.getOptName(1, 1)));
		String optName = in.nextLine();
		a1.setOptionChoice(a1.getOptSetName(1), optName);
		System.out.println("What would you like to choose for option set name " + select.selectAuto(a1.getOptSetName(2) + " ?"));
		System.out.println(select.selectAuto(a1.getOptName(2, 0)));
		System.out.println(select.selectAuto(a1.getOptName(2, 1)));
		String optName1 = in.nextLine();
		a1.setOptionChoice(a1.getOptSetName(2), optName1);*/
		

	}

	public boolean isAutomobile(Object obj) {
		boolean isAutomobile = false;

		try {
			Automobile a1 = (Automobile) obj;
			isAutomobile = true;
		}
		catch (ClassCastException e) {
			isAutomobile = false;
		}

		return isAutomobile;
	}

}

