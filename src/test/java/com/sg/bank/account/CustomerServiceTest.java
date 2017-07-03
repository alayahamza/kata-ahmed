package test.java.com.sg.bank.account;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.com.sg.bank.account.Account;
import main.java.com.sg.bank.account.Customer;
import main.java.com.sg.bank.account.CustomerService;

public class CustomerServiceTest {

    private CustomerService customerService = new CustomerService();
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Steve Jobs", new Account("XSDE23S"));
    }

    @After
    public void tearDown() {
        customer = null;
    }

    @Test
    public void adding_account_to_customer_should_complete_the_list_of_his_account() {

        customerService.addAccount(customer, new Account("CAEF1334"));

        Assertions.assertThat(customerService.getAccount(customer, "CAEF1334")).isPresent();
    }
}
