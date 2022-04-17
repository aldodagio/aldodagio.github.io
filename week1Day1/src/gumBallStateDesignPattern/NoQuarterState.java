package gumBallStateDesignPattern;

public class NoQuarterState implements State {
	
	GumBallMachine gumballMachine;
	public NoQuarterState(GumBallMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	public NoQuarterState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You inserted a quarter");
		// should implement hasQuarter state
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("No quarter to eject");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turnerd, but there is No quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You must pay first");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	

}
