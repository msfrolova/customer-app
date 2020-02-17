package com.enorkus.academy.repository;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.validator.CustomerValidator;

import java.util.List;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService() {
        customerRepository = new MemoryCustomerRepository();
    }

    public List<Customer> fetchCustomer() {
        return customerRepository.findAll();
    }

    public void insertCustomer(Customer customer) {

        String lastName = customer.getLastName();
        String firstName = customer.getFirstName();
        String personalNumber = customer.getPersonalNumber();

        new CustomerValidator().validateCustomer(customer);

        if (personalNumber.length() > 4) {
            personalNumber = personalNumber.substring(0, 4) + "-" + personalNumber.substring(4);
        }

        if (firstName.length() > 1) {
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        }
        if (lastName.length() > 1) {
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        }

        Customer newCustomer = new Customer.CustomerBuilder(firstName, lastName, personalNumber)
                .withMiddleName(customer.getMiddleName())
                .withAge(customer.getAge())
                .withCountryCode(customer.getCountryCode())
                .atCity(customer.getCity())
                .withMonthlyIncome(customer.getMonthlyIncome())
                .withEmployer(customer.getEmployer())
                .withGender(customer.getGender())
                .withMaritalStatus(customer.getMaritalStatus())
                .build();

        customerRepository.insert(newCustomer);

    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
