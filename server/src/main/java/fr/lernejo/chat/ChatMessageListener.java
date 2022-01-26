package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public record ChatMessageListener(ChatMessageRepository messageRepository) {
    public void onMessage(String message) {
        this.messageRepository.addChatMessage(message);
    }
}
