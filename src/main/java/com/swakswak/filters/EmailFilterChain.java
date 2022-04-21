package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailBoxHolder;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public abstract class EmailFilterChain {
    private EmailFilterChain next;
    protected MailBoxHolder mailBoxHolder;

    protected EmailFilterChain() {
        this.mailBoxHolder = MailBoxHolder.getInstance();
    }

    public void setNext(EmailFilterChain next) {
        this.next = next;
    }

    public void filter(Email email) {
        if (next != null) {
            next.filter(email);
        }
    }

    protected abstract void add(Email email);
}
