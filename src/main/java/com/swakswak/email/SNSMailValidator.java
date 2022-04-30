package com.swakswak.email;

import java.util.HashSet;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class SNSMailValidator extends DomainValidator implements Additional<String> {
    private static SNSMailValidator instance;

    private SNSMailValidator() {
        super(new HashSet<>());
    }

    public static synchronized SNSMailValidator getInstance() {
        if (instance == null) {
            instance = new SNSMailValidator();
        }
        return instance;
    }
}
