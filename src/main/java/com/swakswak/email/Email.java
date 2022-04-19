package com.swakswak.email;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Email {
    private final String sender;
    private final String receiver;
    private final String title;
    private final List<String> carbonCopy;
    private final String content;
    private final LocalDateTime receivedAt;

    Email(String sender, String receiver, String title, List<String> carbonCopy, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
        this.carbonCopy = carbonCopy;
        this.content = content;
        this.receivedAt = LocalDateTime.now();
    }

    public String getSender() {
        return sender;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getCarbonCopy() {
        return carbonCopy;
    }

    public String getContent() {
        return content;
    }

    public String getReceiver() {
        return receiver;
    }

    public LocalDateTime getReceivedAt() {
        return receivedAt;
    }

    @Override
    public String toString() {
        return "Email{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", carbonCopy=" + carbonCopy +
                ", content='" + content + '\'' +
                ", receivedAt=" + receivedAt +
                '}';
    }
}
