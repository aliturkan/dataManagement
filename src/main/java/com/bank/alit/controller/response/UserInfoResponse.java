package com.bank.alit.controller.response;

import com.bank.alit.controller.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfoResponse {
 private UserDTO user;
}
