package com.bank.alit.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bank.alit.domain.Account;
import com.bank.alit.domain.enumeration.TransactionType;

import lombok.Data;

@Data
public class AdminTransactionDTO {
	
	private Account account;
	private LocalDateTime date;
	private String description;
	private TransactionType type;
	private double amount;
	private BigDecimal availableBalance;
	

}
