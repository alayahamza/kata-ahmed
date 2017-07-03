package main.java.com.sg.bank.account;

public class AccountService {

	public static final int OVERDRAFT_AMOUNT = -1000;
	
	
    public double getBalance(Account account) {
        return account.getBalance();
    }

    public void makeDeposit(Account account, double amount) {
	    	if(amount > 0) {
	    		account.setBalance(account.getBalance() + amount);
	    	}else {
	    		throw new RuntimeException("Invalid amount");
	    	}
        
    }
    
    
    public void makeWithdrawal(Account account,double amount) {
    		if(amount < 0)  throw new RuntimeException("Invalid amount");
    		
    		double newAccountBalance = account.getBalance() - amount;
    		if(newAccountBalance >= 0) {
    			account.setBalance(newAccountBalance);
    		}else {
    			double overdraftAmount = Math.abs(newAccountBalance) / 10 ;
    			newAccountBalance = newAccountBalance - overdraftAmount;
    			if(newAccountBalance > account.getOverdraftAmount()) {
    				account.setBalance(newAccountBalance);
    			}else {
    				throw new RuntimeException("Not authorized amount");
    			}
    		}
    }
    
    
    public void changeOverdrfat(Account account,double overdraftAmount) {
    		if(overdraftAmount >= -1000 && overdraftAmount <= 0) {
    			account.setOverdraftAmount(overdraftAmount);
    		}else {
    			throw new RuntimeException("Invalid overdraft amount");
    		}
    		
    }
    
}
