

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasSomeCoinState;
	State hasEnoughCoinState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	int cost;   
    int total;
    boolean accept_all;
 
	public GumballMachine(int size, int cost, boolean accept_all) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasSomeCoinState = new HasSomeCoinState(this);
		hasEnoughCoinState = new HasEnoughCoinState(this);
		soldState = new SoldState(this);

		this.count = size;
		this.cost = cost;
		this.total = 0;
		this.accept_all = accept_all;
 		if (size > 0) {
			state = noCoinState;
		} 
	}
 
	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}
 
	public void ejectCoin() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	int getCost() {
		return cost;
	}
	
	int getTotal() {
		return total;
	}
	
 
	boolean getAccept_all() {
		return accept_all;
	}
	
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }
    
    public State getHasSomeCoinState() {
        return hasSomeCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
