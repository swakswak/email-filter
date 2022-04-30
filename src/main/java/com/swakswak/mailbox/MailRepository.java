package com.swakswak.mailbox;

import com.swakswak.email.Email;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public abstract class MailRepository {
    protected final Map<String, List<Email>> emailAddressContentsMap;

    protected MailRepository() {
        this.emailAddressContentsMap = new ConcurrentHashMap<>();
    }

    public List<Email> getContents(String owner) {
        if (emailAddressContentsMap.containsKey(owner)) {
            return emailAddressContentsMap.get(owner);
        }
        throw new NoSuchElementException();
    }

    public void add(String owner, Email email) {
        if (emailAddressContentsMap.containsKey(owner)) {
            emailAddressContentsMap.get(owner).add(email);
        } else {
            List<Email> emails = new LinkedList<>();
            emails.add(email);
            emailAddressContentsMap.put(owner, emails);
        }
    }

    @Override
    public String toString() {
        return "MailBox{" +
                "contents=" + emailAddressContentsMap +
                '}';
    }
}
