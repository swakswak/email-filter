package com.swakswak.email;

/**
 * @author hyoseok choi (hschoi0702@gmail.com)
 **/
public interface Validator<T> {
    boolean isValid(T t);
}
