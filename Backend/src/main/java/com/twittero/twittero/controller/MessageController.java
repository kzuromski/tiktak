package com.twittero.twittero.controller;

import com.twittero.twittero.model.Message;
import com.twittero.twittero.repository.MessageRepository;
import com.twittero.twittero.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MessageController
{
    @Autowired
    private MessageServiceImpl messageService;

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/messages")
    public List<Message> getMessages()
    {
        return messageService.getAllMessages();
    }

    @PostMapping("/messages/add")
    public Message addMessage(@RequestBody Message message)
    {
        return messageRepository.save(message);
    }

    @GetMapping("/messages/{id}")
    public Optional<Message> getMessage(@PathVariable Long id)
    {
        return messageService.findOneById(id);
    }
}
