package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailRepository;
import com.swakswak.mailbox.MailType;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class SpamMailFilter extends EmailFilterChain {
    @Override
    protected void add(Email email) {
        MailRepository spamMailBox = super.mailBoxHolder.get(MailType.SPAM);
        spamMailBox.add(email);
    }
}
