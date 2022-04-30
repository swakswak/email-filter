package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailBoxHolder;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public abstract class EmailFilterChain {
    private EmailFilterChain next;
    protected final MailBoxHolder mailBoxHolder;

    protected EmailFilterChain() {
        this.mailBoxHolder = MailBoxHolder.getInstance();
    }

    public void setNext(EmailFilterChain next) {
        this.next = next;
    }

    public void process(String owner, Email email) {
        this.saveAfterFilter(owner, email);

        if (next != null) {
            next.process(owner, email);
        }
    }

    protected abstract void saveAfterFilter(String owner, Email email);
}
