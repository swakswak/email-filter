package com.swakswak.email;

import com.swakswak.mailbox.MailType;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public class EmailValidatorHolder {
    private static EmailValidatorHolder instance;
    private final Map<MailType, Validator<String>> validatorMap;

    private EmailValidatorHolder() {
        this.validatorMap = new EnumMap<MailType, Validator<String>>(MailType.class);
    }

    public static synchronized EmailValidatorHolder getInstance() {
        if (instance == null) {
            instance = new EmailValidatorHolder();
            return instance;
        }
        return instance;
    }

    public void put(MailType type, Validator<String> validator) {
        validatorMap.put(type, validator);
    }

    public Validator<String> get(MailType type) {
        return validatorMap.get(type);
    }
}
