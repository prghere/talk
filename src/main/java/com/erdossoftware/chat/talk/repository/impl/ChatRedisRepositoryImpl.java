package com.erdossoftware.chat.talk.repository.impl;

import com.erdossoftware.chat.talk.model.ChatDetail;
import com.erdossoftware.chat.talk.repository.ChatRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.UUID;

public class ChatRedisRepositoryImpl implements ChatRedisRepository {
//    private String FILLER = "XXXXXXX";

    private RedisTemplate<UUID, ChatDetail> redisTemplate;
    private HashOperations<UUID, UUID, ChatDetail> hashOperations;

    @Autowired
    public ChatRedisRepositoryImpl(RedisTemplate<UUID, ChatDetail> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void createOrUpdate(UUID uuid, ChatDetail chatDetail) {
        hashOperations.put(uuid, uuid, chatDetail);
    }

    @Override
    public ChatDetail getChatDetail(UUID uuid) {
        return null;
    }

    @Override
    public Boolean delete(UUID uuid) {
        return null;
    }
//    private String generateCacheKey(UUID uuid){
//        return
//    }
}
