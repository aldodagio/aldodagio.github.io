package client;

import java.net.*;

import java.io.*;


public class DefaultSocketClient extends Thread {

	////////// PROPERTIES //////////

	private ObjectOutputStream out;
	private ObjectInputStream in;
	private BufferedReader stdIn;
	private Socket sock;
	private String strHost;
	private int iPort;
	private CarModelOptionsIO clientFTP;
	private SelectCarOptions clientProtocol;

	////////// CONSTRUCTORS //////////

	public DefaultSocketClient(String strHost, int iPort) {
		this.strHost = strHost;
		this.iPort = iPort;
	}

	////////// INSTANCE METHODS //////////

	
	public void establishConnection() {
		try {
			if(sock == null)
			{
				System.out.println("Connecting to host ... ");
				sock = new Socket(strHost, iPort);
			
			}
			if(sock != null) {
			
			System.out.println("Connected to host, creating object streams ... ");
			
			
			out = new ObjectOutputStream(sock.getOutputStream());
			in = new ObjectInputStream(sock.getInputStream());	
			

			

			stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			clientFTP = new CarModelOptionsIO();
			
			
			clientProtocol = new SelectCarOptions();
			}
			
			
		}
		catch (IOException e) {
			System.err.println("Error obtaining I/O for connection to host ... ");
			System.exit(1);
		}
	}

	public void handleConnection() {
		Object fromServer, toServer = null;

		try {
			if (strHost != null)
				System.out.println("Communicating with host ... ");

			while ((fromServer = in.readObject()) != null) {
				if (fromServer != null)
				System.out.println("Received server response ... ");
				System.out.println(fromServer.toString());

				
				//if(clientProtocol.isAutomobile(fromServer))	// this is returning false. 
				//clientProtocol.configureAuto(fromServer);

				System.out.println("Response to server: ");
				toServer = stdIn.readLine();
				
				
				if (toServer.toString().contains(".prop")) {
					toServer = clientFTP.loadPropsFile(toServer.toString());
				}
				if (toServer.toString().contains(".txt")) {
					toServer = clientFTP.loadTextFile(toServer.toString());
					
				}
				
				
				if (toServer != null)
					System.out.println("Sending " + toServer + " to server ... ");
				sendOutput(toServer);
				System.out.println("");

				if (toServer.equals("0")) {
					break;
				}
			}

			if (in != null)
				System.out.println("Closing client input stream ... ");
			in.close();

		}
		catch (ClassNotFoundException e) {
			System.err.println("Error in downloaded object, object may be corrupted ... ");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("Error in I/O stream ... ");
			System.exit(1);
		}

	}

	public void sendOutput(Object obj) {
		try {
			out.writeObject(obj); // obj
		}
		catch (IOException e) {
			System.err.println("Error in I/O stream while sending object to host ... ");
			System.exit(1);
		}
	}

	@Override
	public void run() {
		establishConnection();
		handleConnection();
		try {
			if (out != null)
				System.out.println("Closing client output stream ... ");
			out.close();

			if (stdIn != null)
				System.out.println("Closing client console input stream ... ");
			stdIn.close();

			if (sock != null)
				System.out.println("Closing client socket ... ");
			sock.close();
		}
		catch (IOException e) {
			System.err.println("Error ending client connection ... ");
			System.exit(1);
		}
	}

}

