package com.swakswak.email;

import java.util.HashSet;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class InternalMailValidator extends DomainValidator {
    private static InternalMailValidator instance;

    private InternalMailValidator() {
        super(new HashSet<>());
    }

    public static synchronized InternalMailValidator getInstance() {
        if (instance == null) {
            instance = new InternalMailValidator();
        }
        return instance;
    }
}
