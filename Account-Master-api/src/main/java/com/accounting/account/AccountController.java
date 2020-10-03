package com.accounting.account;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounting.account.bean.Account;

@RestController
public class AccountController {

	@RequestMapping("/hello")
	public String hello() {
		return "HII";
	}

	@RequestMapping("/accounts")
	public List<Account> getAccount() {

		return Arrays.asList(new Account("1", "TestAccount1", "TestType1"),
		new Account("2", "TestAccount2", "TestType2"),
		new Account("3", "TestAccount3", "TestType3"));
	}
}
