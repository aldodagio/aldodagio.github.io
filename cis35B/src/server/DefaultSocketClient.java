package server;

import java.net.*;

import adapter.BuildAuto;
import adapter.StoreAutos;
import client.SelectCarOptions;


import java.io.*;

public class DefaultSocketClient extends Thread {

	////////// PROPERTIES //////////

	private ObjectOutputStream out;
	private ObjectInputStream in;
	private Socket clientSocket;
	private BuildCarModelOptions protocol;
	private StoreAutos lhm = new BuildAuto();
	private SelectCarOptions clientProtocol = new SelectCarOptions();


	////////// CONSTRUCTORS //////////

	public DefaultSocketClient(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	////////// INSTANCE METHODS //////////

	public void handleConnection(Socket sock) {
		if (sock != null)
			System.out.println("Creating server object streams ... ");
		try {
			out = new ObjectOutputStream(sock.getOutputStream());
			in = new ObjectInputStream(sock.getInputStream());
		}
		catch (IOException e) {
			System.err.println("Error creating server object streams ... ");
			System.exit(1);
		}


		protocol = new BuildCarModelOptions();
		String menu = "\nEnter 1 to upload a new Automobile\n"
				+ "Enter 2 to configure an Automobile\n"
				+ "Enter 0 to terminate connection\n";

		try {
			do {
				if (protocol != null)
					System.out.println("Sending client interaction choices ... ");
				sendOutput(menu);

				if (sock.getInputStream() != null)
					System.out.println("Reading client request ... ");
				int request = Integer.parseInt(in.readObject().toString());
				if (sock.getInputStream() != null)
					System.out.println(request);
				if (request == 0)
					break;

				if (sock.getInputStream() != null)
					System.out.println("Sending client request follow-up ... ");
				sendOutput(protocol.setRequest(request));

				if (request >= 1 && request <= 2)
					handleInput(request);

			} while (in.readObject() != null);

			if (sock.getInputStream() != null)
				System.out.println("Closing server input stream for client " + sock.getInetAddress() + " ... ");
			in.close();
		}
		catch (IOException e) {
			System.err.println("Error handling client connection ... ");
			System.exit(1);
		}
		catch (ClassNotFoundException e) {
			System.err.println("Error in uploaded object, object may be corrupted ... ");
			System.exit(1);
		}
	}

	public void sendOutput(Object obj) {
		try {
			out.writeObject(obj);
		}
		catch (IOException e) {
			System.err.println("Error returning output to client ... ");
			System.exit(1);
		}
	}

	
	
	
	public void handleInput(int request) {
		Object fromClient = null;
		Object toClient = null;
		
		try {
			switch (request) {
				case 1: //Client request to build Automobile
					if(fromClient == null)
						System.out.println("Waiting for client to upload file ... "); // take in properties file
							fromClient = in.readObject();
					if(fromClient != null) {
						System.out.println(fromClient);
						System.out.println("Adding new Automobile to database ... ");  // add automobile to linked hash map here
					}
					toClient = protocol.processRequest(fromClient);
					sendOutput(toClient);
					break;

				case 2: //Client request to configure Automobile
					if(fromClient == null)
						System.out.println("Waiting for client to select Automobile ... ");
						fromClient = (String)in.readObject(); // this is reading into fromClient as String "Toyota Prius 2015"
						//clientProtocol.configureAuto((Automobile)lhm.findHashLink((String)fromClient));
					if(fromClient != null)
						System.out.println("Sending Automobile object to client ... ");
						toClient = protocol.processRequest(fromClient);
						sendOutput(toClient);
						break;
						default: //Invalid requests protocol.processRequest(fromClient) != null
			}
		}
		catch (ClassNotFoundException e) {
			System.err.println("Error in uploaded object, file may be corrupted ... ");
			System.exit(1);
		}
		catch (IOException e) {
			System.err.println("Error in retrieving object from client ... ");
			System.exit(1);
		}
	}

	@Override
	public void run() {
		handleConnection(clientSocket);

		//Close client output stream
		if (out != null)
			System.out.println("Closing server output stream for client " + clientSocket.getInetAddress() + " ... ");
		try {
			out.close();
		}
		catch (IOException e) {
			System.err.println("Error closing server output stream for client " + clientSocket.getInetAddress() + " ... ");
		}

		//Close client socket
		if (clientSocket != null)
			System.out.println("Closing client socket " + clientSocket.getInetAddress() + " ... ");
		try {
			clientSocket.close();
		}
		catch (IOException e) {
			System.err.println("Error closing client socket " + clientSocket.getInetAddress() + " ... ");
		}
	}

}
