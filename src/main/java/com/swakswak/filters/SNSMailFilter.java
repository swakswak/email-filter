package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailBox;
import com.swakswak.mailbox.MailType;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class SNSMailFilter extends EmailFilterChain{
    @Override
    protected void add(Email email) {
        MailBox snsMailBox = super.mailBoxHolder.get(MailType.SNS);
        snsMailBox.add(email);
    }
}
