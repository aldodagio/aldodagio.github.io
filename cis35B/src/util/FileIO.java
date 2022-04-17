package util;


import java.io.*;


import exception.AutoException;
import model.Automobile;


public class FileIO {
	private String fname;

	public FileIO() {}
	public FileIO(String fname) {  
		this.fname = fname;
	    }
	
	public Automobile buildAutoObject(String fname) throws AutoException {
		
		Automobile a1 = new Automobile("Ford Focus", "Wagon ZTW", 18445, 5);
		
		a1.createOptSize(0, 10);
		a1.createOptSize(1, 2);
		a1.createOptSize(2, 3);
		a1.createOptSize(3, 2);
		a1.createOptSize(4, 2);
		a1.setOptSetName(0, "color");
		a1.setOptSetName(1, "transmission");
		a1.setOptSetName(2, "brakes");
		a1.setOptSetName(3, "air bags");
		a1.setOptSetName(4, "moon roof");
		a1.setOptPrice(0, 0, 0);
		a1.setOptPrice(0, 1, 0);
		a1.setOptPrice(0, 2, 0);
		a1.setOptPrice(0, 3, 0);
		a1.setOptPrice(0, 4, 0);
		a1.setOptPrice(0, 5, 0);
		a1.setOptPrice(0, 6, 0);
		a1.setOptPrice(0, 7, 0);
		a1.setOptPrice(0, 8, 0);
		a1.setOptPrice(0, 9, 0);
		a1.setOptPrice(1, 0, -815);
		a1.setOptPrice(1, 1, 0);
		a1.setOptPrice(2, 0, 0);
		a1.setOptPrice(2, 1, 400);
		a1.setOptPrice(2, 2, 1625);
		a1.setOptPrice(3, 0, 350);
		a1.setOptPrice(3, 1, 0);
		a1.setOptPrice(4, 0, 595);
		a1.setOptPrice(4, 1, 0);
		a1.setOptName(0, 0, "Fort Knox Gold Clearcoat Metallic");
		a1.setOptName(0, 1, "Liquid Grey Clearcoat Metallic");
		a1.setOptName(0, 2, "Infra-Red Clearcoat");
		a1.setOptName(0, 3, "Grabber Green Clearcoat Metallic");
		a1.setOptName(0, 4, "Sangria Red Clearcoat Metallic");
		a1.setOptName(0, 5, "French Blue Clearcoat Metallic");
		a1.setOptName(0, 6, "Twilight Blue Clearcoat Metallic");
		a1.setOptName(0, 7, "CD Silver Clearcoat Metallic");
		a1.setOptName(0, 8, "Pitch Black Clearcoat");
		a1.setOptName(0, 9, "Cloud 9 White Clearcoat");
		a1.setOptName(1, 0, "Manual");
		a1.setOptName(1, 1, "Automatic");
		a1.setOptName(2, 0, "Standard");
		a1.setOptName(2, 1, "Air Brake System");
		a1.setOptName(2, 2, "Air Brake System w/ Traction");
		a1.setOptName(3, 0, "Present");
		a1.setOptName(3, 1, "Not present");
		a1.setOptName(4, 0, "Present");
		a1.setOptName(4, 1, "Not present");
		a1.setYear("2009");
		
		// checking for a null OptionSet name
		for(int i = 0; i < a1.getOptSetLen(); i++)
		{
			try {	
			if(a1.getOptSetName(i) == null)
			 throw new AutoException(1, "nullpointerexception (option set name missing)");
			}catch(AutoException e)
			{
				e.fix(1, a1);
			}
		}
		// checking for a null Option name
		for(int i = 0; i < a1.getOptSetLen(); i++)
		{
			for(int j = 0; j < a1.getOptionLen(i); j++)
			try {	
			if(a1.getOptName(i, j) == null)
			 throw new AutoException(2, "nullpointerexception (option name missing)");
			}catch(AutoException e)
			{
				e.fix(2, a1);
			}
		}
		// checking for a null price
		for(int i = 0; i < a1.getOptSetLen(); i++)
		{
			for(int j = 0; j < a1.getOptionLen(i); j++)
			try {	
				Float temp = a1.getOptPrice(i, j);
			 if(temp == null)
			 throw new AutoException(3, "nullpointerexception (option price missing)");
			}catch(AutoException e)
			{
				e.fix(3, a1);
			}
		}
		
		
		
		try { 
			FileOutputStream f1 = new FileOutputStream(fname);
			
			try {
				ObjectOutputStream out = new ObjectOutputStream(f1);
				out.writeObject(a1);
			} catch (IOException e) {
				System.out.println("File not found.");
				System.exit(1);
			}
		} catch (FileNotFoundException e) {
			throw new AutoException("File not found: " + fname, e);
		}
		
		
		return a1;
		
	}
	public String writeData(Automobile a1, String fname) throws AutoException 
	{
		
		
		try { 
			FileOutputStream f1 = new FileOutputStream(fname);
			try {
				ObjectOutputStream out = new ObjectOutputStream(f1);
				out.writeObject(a1);
			} catch (IOException e) {
				System.out.println("Can't write to file.");
				System.exit(1);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
	 return fname; 
	 }
	public Automobile readData(String serfname) throws AutoException { 
		Automobile newa1 = null;
		
		try {
			if(!serfname.equals(fname))
				throw new AutoException(4, "Wrong file name used to buildAuto. Check file name and re-enter correct file name");
		}catch(AutoException e) {
			e.fix(4, newa1);
		}
		
		try {
		FileInputStream  f1 = new FileInputStream(serfname);
		ObjectInputStream in = new ObjectInputStream(f1);
		
		try {
			newa1 = (Automobile)in.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
		}
		catch (IOException e) {
			System.out.println("File not found.");
			System.exit(1);
		} 
			
		return newa1;
		
	}
	public String getFileName() { return fname; }
	public void setFileName(String fileName) { this.fname = fileName; }
	
}
