

public class Main {

	public static void main(String[] args) {
		//Initiating Gumball Machine #1...
		GumballMachine gumballMachine = new GumballMachine(5, 25, false);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		//Initiating Gumball Machine #2...
		gumballMachine = new GumballMachine(5, 50, false);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		//Initiating Gumball Machine #3...
		gumballMachine = new GumballMachine(5, 50, true);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}
}
