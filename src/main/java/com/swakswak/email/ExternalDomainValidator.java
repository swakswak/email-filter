package com.swakswak.email;

import java.util.HashSet;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class ExternalDomainValidator extends DomainValidator {
    private static ExternalDomainValidator instance;

    private ExternalDomainValidator() {
        super(new HashSet<>());
    }

    public static synchronized ExternalDomainValidator getInstance() {
        if (instance == null) {
            instance = new ExternalDomainValidator();
            return instance;
        }
        return instance;
    }
}
