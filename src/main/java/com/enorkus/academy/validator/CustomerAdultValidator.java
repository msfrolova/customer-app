package com.enorkus.academy.validator;

import com.enorkus.academy.exception.ValidationException;

public class CustomerAdultValidator extends Validator<Integer> {

    public void validate(Integer value, String errorMessage) {
        if (value < 18) {
            throw new ValidationException(errorMessage);
        }
    }
}
