package com.enorkus.academy.validator;

import com.enorkus.academy.exception.ValidationException;

public class MandatoryValueValidator extends Validator<String> {
    public void validate(String value, String errorMessage) {
        if (value.trim().isEmpty() || value.equals("0")) {
            throw new ValidationException(errorMessage);
        }
    }
}
