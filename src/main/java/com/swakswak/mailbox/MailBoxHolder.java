package com.swakswak.mailbox;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class MailBoxHolder {
    private final Map<MailType, MailRepository> mailBoxMap;
    private static MailBoxHolder instance;

    private MailBoxHolder() {
        this.mailBoxMap = new EnumMap<>(MailType.class);
    }

    public static synchronized MailBoxHolder getInstance() {
        if (instance == null) {
            instance = new MailBoxHolder();
            return instance;
        }

        return instance;
    }

    public void add(MailType key, MailRepository value) {
        mailBoxMap.put(key, value);
    }

    public MailRepository get(MailType key) {
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
