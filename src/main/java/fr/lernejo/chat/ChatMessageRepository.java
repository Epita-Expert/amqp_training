package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ChatMessageRepository {
    private ArrayList<String> messages = new ArrayList<String>();

    void addChatMessage(String message) {
        if (this.messages.size() == 10) {
            this.messages.remove(0);
        }
        this.messages.add(message);
    }
    List<String> getLastTenMessages() {
        return this.messages;
    }
}
