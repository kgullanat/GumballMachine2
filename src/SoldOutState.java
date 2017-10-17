
public class SoldOutState implements State{
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		
	}
	public void insertQuarter(){
		System.out.println("You can't insert a quarter,the machine is sold out");
	}
	public void ejectQuarter(){
		System.out.println("You can't eject,you haven't inserted a quarter yet");
	}
	public void turnCrank(){
		System.out.println("You turned, but there are no gumball");
	}
	public void dispense(){
		System.out.println("No gumball dispense");
	}

}
