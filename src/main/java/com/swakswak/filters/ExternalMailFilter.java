package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailBox;
import com.swakswak.mailbox.MailType;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class ExternalMailFilter extends EmailFilterChain{
    @Override
    protected void add(Email email) {
        MailBox externalMailBox = super.mailBoxHolder.get(MailType.EXTERNAL);
        externalMailBox.add(email);
    }
}
