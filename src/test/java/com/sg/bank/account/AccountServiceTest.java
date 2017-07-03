package test.java.com.sg.bank.account;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import main.java.com.sg.bank.account.Account;
import main.java.com.sg.bank.account.AccountService;
import main.java.com.sg.bank.account.Customer;
import main.java.com.sg.bank.account.CustomerService;


public class AccountServiceTest {

	private CustomerService customerService = new CustomerService();
	private AccountService accountService = new AccountService();
	private Customer customer;
	private Account account;
	
	@Before
	public void setup() {
		 customer = new Customer("Steve Jobs", new Account("XSDE23S"));
		 account = new Account("TestAccount");
	}
	
	@After
    public void tearDown() {
        customer = null;
        account = null;
    }
	
	@Test
	public void when_make_deposit_account_balance_should_increase() {
		account.setBalance(2000);
		accountService.makeDeposit(account, 3000);
		Assertions.assertThat(account.getBalance()).isEqualTo(5000);
	}
	
	@Test
	public void when_make_withdrawal_account_balance_should_decrease() {
		account.setBalance(2000);
		accountService.makeWithdrawal(account, 1000);
		Assertions.assertThat(account.getBalance()).isEqualTo(1000);
	}
	
	@Test
	public void when_make_withdrawal_and_new_account_balance_is_negative_apply_overdraft() {
		account.setBalance(10);
		accountService.makeWithdrawal(account, 100);
		Assertions.assertThat(account.getBalance()).isEqualTo(-99);
	}
	
}
