package server;



import adapter.ProxyAutomobile;
import client.CarModelOptionsIO;
import model.Automobile;




public class BuildCarModelOptions extends ProxyAutomobile {

	////////// PROPERTIES //////////

	private static final int WAITING = 0;
	private static final int REQUEST_BUILD_AUTO = 1;
	private static final int REQUEST_CONFIGURE_AUTO = 2;

	private int state = WAITING;

	////////// CONSTRUCTORS //////////

	public BuildCarModelOptions() {
		
	}

	////////// INSTANCE METHODS //////////

	public Object processRequest(Object obj) {
		Object toClient = null;

		if (state == REQUEST_BUILD_AUTO) {
		//add code to buildauto
			
			
			toClient = "Automobile object successfully added to database\n"
					+ "Press any key to return to main menu";
		}
		else if (state == REQUEST_CONFIGURE_AUTO) {
		//add code for configureauto
			
			CarModelOptionsIO io = new CarModelOptionsIO();
			String lhm = obj.toString();
			Automobile a1 = super.findHashLink(lhm);
			super.writeData(a1);
			super.readData();
			for(int i = 0; i < a1.getOptSetLen(); i++)
			{
				if(a1.getOptSetName(i) != null)
					super.setOptionChoice();		
			}
			
			//super.printConfiguredAuto();
			
			toClient = "Automobile object successfully added to database in file 'auto1.ser'\n"
					+ "Press any key to return to main menu";	
			}
		else {

		}

		this.state = WAITING;

		return toClient;
	}

	public String setRequest(int i) {
		String output = null;

		if (i == 1) {
			this.state = REQUEST_BUILD_AUTO;
			output = "Waiting for file name with new auto data stored. (Ex. Properties.prop or Properties.txt)";
		}
		else if (i == 2) {
			this.state = REQUEST_CONFIGURE_AUTO;
			output = "Select an Automobile from the following list to configure: \n";
					super.printLinkedHashMap();
		}
		else {
			output = "Invalid request";
		}

		return output;
	}



}

