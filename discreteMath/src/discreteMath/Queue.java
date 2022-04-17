package discreteMath;

class Queue {
	  int n;

	  synchronized int get() {
	  	System.out.println("Got: " + n);
		try {  
			Thread.sleep(3000); 
	     	} catch (InterruptedException e) { }	
		return n;
	  }

	  synchronized void put(int n) {
	  	this.n = n;
		System.out.println("Put: " + n);
		try {  
			Thread.sleep(3000); 
	     	} catch (InterruptedException e) { }	
	  }

	}
