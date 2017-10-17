
public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	void setState (State state){
		this.state = state;
	}
	
	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0){
			count = count-1;
		}
	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}

	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}

	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}

}
