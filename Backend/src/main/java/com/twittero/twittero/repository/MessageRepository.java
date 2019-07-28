package com.twittero.twittero.repository;

import com.twittero.twittero.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
