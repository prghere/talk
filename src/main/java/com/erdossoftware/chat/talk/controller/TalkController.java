package com.erdossoftware.chat.talk.controller;

import com.erdossoftware.chat.talk.model.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TalkController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ChatMessage greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return  ChatMessage.builder()
                .id(UUID.randomUUID())
                .content(String.format(template, name))
                .build();
    }
}
