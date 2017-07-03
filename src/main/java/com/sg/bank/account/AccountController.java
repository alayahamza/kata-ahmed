package main.java.com.sg.bank.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	private AccountService accountService;

	@RequestMapping("/makeDeposit")
	public void makeDeposit(Account account,double amount) {
		this.accountService.makeDeposit(account, amount);
	}
}
