package com.swakswak.email;

import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class Email {
    private final String sender;
    private final String title;
    private final List<String> carbonCopy;
    private final String content;

    Email(String sender, String title, List<String> carbonCopy, String content) {
        this.sender = sender;
        this.title = title;
        this.carbonCopy = carbonCopy;
        this.content = content;
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

    @Override
    public String toString() {
        return "Email{" +
                "sender='" + sender + '\'' +
                ", title='" + title + '\'' +
                ", carbonCopy=" + carbonCopy +
                ", content='" + content + '\'' +
                '}';
    }
}
