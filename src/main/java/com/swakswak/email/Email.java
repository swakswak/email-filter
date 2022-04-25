package com.swakswak.email;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Email {
    private final EmailAddress sender;
    private final EmailAddress receiver;
    private final String title;
    private final String content;
    private final List<String> carbonCopy;
    private final LocalDateTime receivedAt;

    public Email(EmailAddress sender, EmailAddress receiver, String title, String content, List<String> carbonCopy, LocalDateTime receivedAt) {
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
        this.content = content;
        this.carbonCopy = carbonCopy;
        this.receivedAt = receivedAt;
    }

    public EmailAddress getSender() {
        return sender;
    }

    public EmailAddress getReceiver() {
        return receiver;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<String> getCarbonCopy() {
        return carbonCopy;
    }

    public LocalDateTime getReceivedAt() {
        return receivedAt;
    }

    @Override
    public String toString() {
        return "Email{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", carbonCopy=" + carbonCopy +
                ", receivedAt=" + receivedAt +
                '}';
    }
}
