package com.swakswak.email;

import java.util.Objects;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
class EmailAddress {
    private final String username;
    private final String domain;

    EmailAddress(String username, String domain) {
        this.username = username;
        this.domain = domain;
    }

    public String getUsername() {
        return username;
    }

    public String getDomain() {
        return domain;
    }

    public String getAddress() {
        return username + "@" + domain;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof EmailAddress) {
            return this.getAddress().equals(((EmailAddress) o).getAddress());
        }
        return false;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "username='" + username + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}
