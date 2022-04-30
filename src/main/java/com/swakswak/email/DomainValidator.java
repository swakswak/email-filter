package com.swakswak.email;

import java.util.Set;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public abstract class DomainValidator implements Validator<String>, Additional<String> {
    protected final Set<String> domains;

    protected DomainValidator(Set<String> domains) {
        this.domains = domains;
    }

    @Override
    public boolean isValid(String domain) {
        return domains.contains(domain);
    }

    @Override
    public void add(String domain) {
        domains.add(domain);
    }

    public Iterable<String> getDomains() {
        return domains;
    }
}
