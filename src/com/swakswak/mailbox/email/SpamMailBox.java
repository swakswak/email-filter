package com.swakswak.mailbox.email;

import com.swakswak.mailbox.MailBox;
import com.swakswak.email.Email;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class SpamMailBox implements MailBox {
    private final List<Email> contents;

    public SpamMailBox() {
        this.contents = new LinkedList<>();
    }

    @Override
    public List<Email> getContents() {
        return this.contents;
    }

    @Override
    public void add(Email email) {
        contents.add(email);
    }

    @Override
    public String toString() {
        return "SpamMailBox{" +
                "contents=" + contents +
                '}';
    }
}
