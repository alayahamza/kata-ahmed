package main.java.com.sg.bank.account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data // generate getter, setter (if any), toString, equals and hashcode during compilation
@RequiredArgsConstructor // generate constructor for final field during compilation
public class Customer {

	private final String name;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
    		this.name = name;
    }
    
    public Customer(String name, Account... accounts) {
        this(name);
        this.accounts.addAll(Arrays.asList(accounts));
    }
    
    public String getName() {
		return name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
}
