package com.enorkus.academy.validator;

import com.enorkus.academy.entity.CountryCode;
import com.enorkus.academy.exception.ValidationException;

import java.util.List;

public class CountryCodeValidator extends Validator<String> {
    public void validate(String value, String errorMessage) {
        List<String> countryCodes = CountryCode.getCountryCodes();

        if (!value.isEmpty() && !countryCodes.contains(value)) {
            throw new ValidationException(errorMessage);
        }
    }
}
