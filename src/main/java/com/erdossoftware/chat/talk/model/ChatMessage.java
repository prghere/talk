package com.erdossoftware.chat.talk.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class ChatMessage {
    private final UUID id;
    private final String content;
}
