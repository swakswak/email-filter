package com.swakswak.mailbox;

import com.swakswak.email.Email;

import java.util.List;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public interface MailBox {
    List<Email> getContents();

    void add(Email email);

    String toString();
}
