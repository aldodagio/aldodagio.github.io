package exception;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.time.Instant;

import model.Automobile;
import util.FileIO;

public class AutoException extends Exception {

	private int errno;
	private String errmsg;
	
    ArrayList<String> list = new ArrayList<String>();
	public AutoException() {
		super();
		printmyproblem();
	}
	
	public AutoException(String errmsg) {
		super();
		this.errmsg = errmsg;
		printmyproblem();
	}
	
	public AutoException(int errno) {
		super();
		this.errno = errno;
		printmyproblem();
	}
	
	public AutoException(int errno, String errmsg) {
		super();
		this.errno = errno;
		this.errmsg = errmsg;
		printmyproblem();
	}
	
	public AutoException(String errmsg, Throwable err) {
		super(errmsg, err);
	}
	
	public int getErrNo() {
		return errno;
	}
	
	public void setErrNo(int errno) {
		this.errno = errno;
	}
	
	public String getErrMsg() {
		return errmsg;
	}
	
	public void setErrMsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	public void printmyproblem() {
		
		System.out.println("AutoException [errorno=" + errno + ", errormsg=" + errmsg);
		
		try { 
			FileOutputStream f1 = new FileOutputStream("logfile.txt");
			
			try {
				Timestamp instant= Timestamp.from(Instant.now());
				ObjectOutputStream out = new ObjectOutputStream(f1);
				out.writeObject("AutoException [errorno=" + errno + ", errormsg=" + errmsg + instant);
				out.close();
			} catch (IOException e) {
				System.out.println("File not found.");
				System.exit(1);
			}
			  
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
	}

	public String fixProblemReadFromConsole()
	{
		String a = "Z:\\JavaPrograms\\SelfHealingSoftware\\bin\\abc.txt";
		System.out.println("got here --> fixProblemReadFromConsole");
		return a;
	}
	
	public void fix(int errno, Automobile a1) {
		Fix1To5 fix = new Fix1To5();
		switch(errno)
		{
		case 1: fix.fix1(a1);
				break;
		case 2: fix.fix2(a1);
				break;
		case 3: fix.fix3(a1);
				break;
		case 4: fix.fix4();
				break;
		case 5: fix.fix5();
				break;
		default:
		}
		
	}
	
	class Fix1To5 {
		
		public Fix1To5() {}
		public void fix1(Automobile a1) {
			//a1.setOptSetName(x, setName);
			Scanner input = new Scanner(System.in);
			System.out.println("Which option set number would you like to place this as?");
			int index = input.nextInt();
			Scanner input1 = new Scanner(System.in);
			System.out.println("There is no name for this option set. Please enter one.");
			String setName = input1.nextLine();
			a1.setOptSetName(index, setName);
			
		}
		public void fix2(Automobile a1) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which option set number should this be set as?");
			int optSetIndex = input.nextInt();
			Scanner input2 = new Scanner(System.in);
			System.out.println("Which option number should this be set as?");
			int optIndex = input2.nextInt();
			Scanner input1 = new Scanner(System.in);
			System.out.println("There is no name for this option. Set a name for this option please.");
			String setName = input1.nextLine();
			a1.setOptName(optSetIndex, optIndex, setName);
		}
		public void fix3(Automobile a1) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which option set number should this be set as?");
			int optSetIndex = input.nextInt();
			Scanner input2 = new Scanner(System.in);
			System.out.println("Which option number should this be set as?");
			int optIndex = input2.nextInt();
			Scanner input1 = new Scanner(System.in);
			System.out.println("There is no price for this option. Set a price for this option please.");
			float newPrice = input1.nextFloat();
			a1.setOptPrice(optSetIndex, optIndex, newPrice);
		}
		public void fix4() {
			FileIO fn = new FileIO();
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the correct file name to build object.");
			String fname = input.nextLine();
			fn.setFileName(fname);
		}
		public void fix5() {}
		
	}
}
