package com.bank.alit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.alit.domain.Account;
import com.bank.alit.domain.Recipient;
import com.bank.alit.domain.User;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Long> {
	
	Boolean existsByUserAndAccount(User user, Account account);
	
	
	@Query("SELECT r from Recipient r  where r.user.id=:userId and r.account.id=:accountId")
	Optional<Recipient> findRecipientByUserAndAccountId(@Param ("userId") Long userId, @Param("accountId") Long accountId);
	

}
