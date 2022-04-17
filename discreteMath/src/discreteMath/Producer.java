package discreteMath;

class Producer implements Runnable {
	  Queue q;

	  Producer(Queue q) {
	  this.q = q;
	  new Thread(this, "Producer").start();
	  }

	  public void run() {
	   int i = 0;
	   while(true) {
	      i = i + 1;
	      q.put(i);
	   }
	  }

	}