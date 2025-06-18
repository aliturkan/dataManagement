package com.bank.alit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.alit.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
