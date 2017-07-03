package main.java.com.sg.bank.account;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // generate getter, setter (if any), toString, equals and hashcode during compilation
@RequiredArgsConstructor // generate constructor for final field during compilation
public class Account {

    private final String id;
    private double balance;
    private double overdraftAmount = -1000;

	public Account(String id) {
    		this.id = id;
    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
    
    
}
