package main.java.com.sg.bank.account;

import java.util.Optional;

public class CustomerService {

    public void addAccount(Customer customer, Account account) {
        customer.getAccounts().add(account);
    }

    public Optional<Account> getAccount(Customer customer, String accountId) {
        return customer.getAccounts().
                stream().
                filter(account -> account.getId().equals(accountId)).
                findAny();
    }
}
