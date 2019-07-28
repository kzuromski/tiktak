package com.twittero.twittero.service;

import com.twittero.twittero.model.Message;
import com.twittero.twittero.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService
{
    @Autowired
    MessageRepository messageRepository;

    public List<Message> getAllMessages()
    {
        return messageRepository.findAll();
    }

    public Optional<Message> findOneById(Long id)
    {
        return messageRepository.findById(id);
    }
}
