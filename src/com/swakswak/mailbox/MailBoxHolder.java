package com.swakswak.mailbox;

import java.util.EnumMap;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class MailBoxHolder {
    private final EnumMap<MailType, MailBox> mailBoxMap;

    MailBoxHolder(EnumMap<MailType, MailBox> mailBoxMap) {
        this.mailBoxMap = mailBoxMap;
    }

    public void add(MailType key, MailBox value) {
        mailBoxMap.put(key, value);
    }

    public MailBox get(MailType key) {
        return mailBoxMap.get(key);
    }

    public boolean containsKey(MailType key) {
        return mailBoxMap.containsKey(key);
    }

    @Override
    public String toString() {
        return "MailBoxHolder{" +
                "mailBoxMap=" + mailBoxMap +
                '}';
    }
}
