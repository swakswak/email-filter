package com.swakswak.email;

import java.util.HashSet;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class SpamDomainValidator extends DomainValidator {
    private static SpamDomainValidator instance;

    private SpamDomainValidator() {
        super(new HashSet<>());
    }

    public static synchronized SpamDomainValidator getInstance() {
        if (instance == null) {
            instance = new SpamDomainValidator();
        }
        return instance;
    }
}
