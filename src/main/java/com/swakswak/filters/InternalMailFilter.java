package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailRepository;
import com.swakswak.mailbox.MailType;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class InternalMailFilter extends EmailFilterChain {
    @Override
    protected void add(Email email) {
        MailRepository internalMailBox = super.mailBoxHolder.get(MailType.INTERNAL);
        internalMailBox.add(email);
    }
}
