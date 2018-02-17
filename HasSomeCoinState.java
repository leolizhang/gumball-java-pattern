
public class HasSomeCoinState implements State{

	GumballMachine gumballMachine;

	public HasSomeCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(int coin) {
		gumballMachine.total += coin;
		System.out.println("You inserted a coin");
		if(!gumballMachine.getAccept_all() && coin != 25) {
			System.out.println("Only quarters accepted.");
		} 
		else if(gumballMachine.total >= gumballMachine.getCost()) {
			gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		} 
		else {
			gumballMachine.setState(gumballMachine.getHasSomeCoinState());
		}
	}
	
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}

	public void turnCrank() {
		System.out.println("You turned, but payment not completed");
	}

	public void dispense() {
		System.out.println("You need to pay more");
	}

	public String toString() {
		return "waiting for more coins";
	}
	
}
