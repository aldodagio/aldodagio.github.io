package discreteMath;

	public class ThreadX extends Thread {
		  public void run() {
			    try {
			      while(true) {
			        Thread.sleep(2000);
			        System.out.println("Hello");
			      }
			    }
			    catch(InterruptedException ex) {
			      ex.printStackTrace();
			    }
			  }
			}


