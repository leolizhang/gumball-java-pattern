

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
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
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
