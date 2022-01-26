package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public record ChatMessageController(ChatMessageRepository messageRepository) {
    @GetMapping
    public List<String> getLastMessages() {
        return this.messageRepository.getLastTenMessages();
    }
}
