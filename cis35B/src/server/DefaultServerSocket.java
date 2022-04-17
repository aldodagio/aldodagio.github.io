package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class DefaultServerSocket extends Thread {

	////////// PROPERTIES //////////

	private int port;
	private ServerSocket server = null;

	////////// CONSTRUCTORS //////////

	public DefaultServerSocket(int port) {
		
		try {
			this.server = new ServerSocket(port);
			this.port = this.server.getLocalPort();
		}
		catch (IOException e) {
			System.err.println("Could not listen on port " + port + " ... ");
			System.exit(1);
		}
	}

	////////// INSTANCE METHODS //////////

	@Override
	public void run() {
		
		Socket clientSocket = null;

		while(true) {
			//Accept client
			try {
				clientSocket = server.accept();
			}
			catch (IOException e) {
				System.err.println("Error establishing client connection ... ");
				System.exit(1);
			}
		
			//Handle client-server interaction
			if(clientSocket != null)
				System.out.println(clientSocket.getLocalAddress());
			new DefaultSocketClient(clientSocket).start();
		}
	

	}
		
	
	
	public int getPort() {
		return this.port;
	}

}

