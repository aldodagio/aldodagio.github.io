package driver;
import java.io.IOException;


import adapter.*;
import exception.AutoException;



public class Driver {
	
	
	
	public static void main(String[] args) throws AutoException {		
		
		
		
		//EditOpsInterface edit = new BuildAuto();
		
		/*edit.updateOptName("Ford FocusWagon ZTW2009", "color", "blu", "blue"); // synchronized test should work
		edit.updateOptName("Ford FocusWagon ZTW2009", "color", "blu", "red"); // synchronized test that shouldn't work
		
		edit.updateOptName1("Ford FocusWagon ZTW2009", "color", "blue", "blu"); // non-synchronized test that should work
		edit.updateOptName1("Ford FocusWagon ZTW2009", "color", "blue", "red"); // non-synchronized test that shouldn't work*/
	
		//edit.edit(0);
		//edit.edit(0);
		//CreateAuto a1 = new BuildAuto();
		//a1.buildAuto("auto.ser");
		AutoServable a2 = new BuildAuto();
		a2.serve(0);
		
				
		//a2.servlet();
		
		
	}

}
