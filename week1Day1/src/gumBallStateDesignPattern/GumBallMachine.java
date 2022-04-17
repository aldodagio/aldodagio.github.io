package gumBallStateDesignPattern;

public class GumBallMachine {

	State state; // = soldOutState;
	State soldOutState;
	State noQuarterState;
	State soldState;
	State hasQuarterState;
	
	int count = 0;
	
	public GumBallMachine(int numGumballs) {
		
		soldOutState = new SoldOutState();
		noQuarterState = new NoQuarterState();
		hasQuarterState = new HasQuarterState();
		soldState = new SoldState();
		
		count = numGumballs;
		if(numGumballs > 0) {
			// no quarter state
		}
	}
	int getCount() { return count; }
	public void setState(State state) { this.state = state; }
	public State getState() { return state; }
	
}
