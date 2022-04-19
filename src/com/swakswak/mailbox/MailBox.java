package com.swakswak.mailbox;

import com.swakswak.email.Email;

import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class MailBox {
    protected final List<Email> contents;

    public MailBox(List<Email> contents) {
        this.contents = contents;
    }

    public List<Email> getContents() {
        return contents;
    }

    public void add(Email email) {
        contents.add(email);
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "contents=" + contents +
                '}';
    }
}
