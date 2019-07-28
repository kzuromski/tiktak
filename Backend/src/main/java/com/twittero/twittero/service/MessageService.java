package com.twittero.twittero.service;

import com.twittero.twittero.model.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService
{
    List<Message> getAllMessages();
    Optional<Message> findOneById(Long id);
}
