package com.bank.alit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.alit.domain.Account;
import com.bank.alit.domain.User;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

	Optional<Account> findByAccountNumber(Long accountNumber);
	
	Optional<Account> findByUser(User user);
	

	@Query("select SUM(a.accountBalance) FROM Account a")
	Double getTotalBalance();
	
}
