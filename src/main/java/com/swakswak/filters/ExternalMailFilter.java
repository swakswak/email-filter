package com.swakswak.filters;

import com.swakswak.email.Email;
import com.swakswak.mailbox.MailRepository;
import com.swakswak.mailbox.MailType;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class ExternalMailFilter extends EmailFilterChain {
    @Override
    protected void saveAfterFilter(String owner, Email email) {
        if (this.isExternal(email)) {
            this.save(owner, email);
        }
    }

    private boolean isExternal(Email email) {
        return false;
    }

    private void save(String owner, Email email) {
        MailRepository externalMailRepository = super.mailBoxHolder.get(MailType.EXTERNAL);
        externalMailRepository.add(owner, email);
    }
}
