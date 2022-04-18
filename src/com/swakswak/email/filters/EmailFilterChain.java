package com.swakswak.email.filters;

import com.swakswak.email.Email;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public abstract class EmailFilterChain {
    private EmailFilterChain next;

    public void setNext(EmailFilterChain next) {
        this.next = next;
    }

    public void filter(Email email) {
        if (next != null) {
            next.filter(email);
        }
    }
}
