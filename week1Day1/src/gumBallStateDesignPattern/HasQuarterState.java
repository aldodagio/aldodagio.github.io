package gumBallStateDesignPattern;

public class HasQuarterState implements State {

	GumBallMachine gumballMachine;

	public HasQuarterState(GumBallMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	public HasQuarterState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you cant insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
	
}
