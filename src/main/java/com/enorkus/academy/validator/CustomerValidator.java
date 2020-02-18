package com.enorkus.academy.validator;

import com.enorkus.academy.entity.Customer;

public class CustomerValidator {

    public void validateCustomer(Customer customer) {
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        String personalNumber = customer.getPersonalNumber();
        int age = customer.getAge();
        String countryCode = customer.getCountryCode();

        MandatoryValueValidator mandatoryValueValidator = new MandatoryValueValidator();
        mandatoryValueValidator.validate(firstName, "First name is mandatory");
        mandatoryValueValidator.validate(lastName, "Last name is mandatory");
        mandatoryValueValidator.validate(personalNumber, "Personal number is mandatory");
        mandatoryValueValidator.validate(Integer.toString(age), "Age is mandatory");

        CustomerAdultValidator customerAdultValidator = new CustomerAdultValidator();
        customerAdultValidator.validate(age, "Customer should be at least 18 years old");

        CountryCodeValidator countryCodeValidator = new CountryCodeValidator();
        countryCodeValidator.validate(countryCode, "Invalid country code");

    }
}
