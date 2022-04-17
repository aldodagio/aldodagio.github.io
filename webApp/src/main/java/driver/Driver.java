package driver;

import adapter.AutoServable;
import adapter.BuildAuto;
import exception.AutoException;

public class Driver {

public static void main(String[] args) throws AutoException {		
		
		
		AutoServable a2 = new BuildAuto();
		a2.serve(0);
		
		
		
	}
	
}
