package com.bank.alit.controller.response;

import java.util.List;

import com.bank.alit.controller.dto.AccountDTO;
import com.bank.alit.controller.dto.TransactionDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashBoardInfoReponse {
	List<TransactionDTO> list;
	double totalDeposit;
	double totalWithdraw;
	double totalTransfer;
	
	AccountDTO account;

}
