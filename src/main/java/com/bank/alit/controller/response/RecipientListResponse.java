package com.bank.alit.controller.response;

import java.util.ArrayList;
import java.util.List;

import com.bank.alit.controller.dto.RecipientDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RecipientListResponse {
	private List<RecipientDTO> recipients=new ArrayList<>();
	

}
