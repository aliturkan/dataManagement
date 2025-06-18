package com.bank.alit.controller.response;

import java.util.List;

import com.bank.alit.controller.dto.AdminTransactionDTO;

import lombok.Data;

@Data
public class BankStatementResponse {
	
     private List<AdminTransactionDTO> list;
     private double totalBalance;
	

}
