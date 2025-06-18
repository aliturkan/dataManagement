package com.bank.alit.security.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.alit.domain.User;
import com.bank.alit.exception.ResourceNotFoundException;
import com.bank.alit.exception.message.ExceptionMessage;
import com.bank.alit.repository.UserRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUserNameAndEnabledTrue(username).
				orElseThrow(()->new ResourceNotFoundException(String.format(ExceptionMessage.USER_NOT_FOUND_MESSAGE,username)));
		return UserDetailsImpl.build(user);
	}

	
}
