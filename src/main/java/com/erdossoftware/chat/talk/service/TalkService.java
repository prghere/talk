package com.erdossoftware.chat.talk.service;

import java.util.UUID;

public interface TalkService {
    public UUID initiateChat();
    public void sendChatMessage();
}
