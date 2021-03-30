package com.erdossoftware.chat.talk.repository;

import com.erdossoftware.chat.talk.model.ChatDetail;

import java.util.UUID;

public interface ChatRedisRepository {
    void createOrUpdate(UUID uuid, ChatDetail chatDetail);
    ChatDetail getChatDetail(UUID uuid);
    Boolean delete(UUID uuid);
}
