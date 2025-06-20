package com.bank.alit.exception.message;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class ErrorMessage {
	
	private Date date;
	private String message;
	private String description;

}
