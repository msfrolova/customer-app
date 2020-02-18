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

        new CustomerValidator().validateCustomer(customer);

        Customer newCustomer = new Customer.CustomerBuilder(formatName(customer.getFirstName()), formatName(customer.getLastName()), formatPersonalNumber(customer.getPersonalNumber()))
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

    public String formatName(String name) {

        if (name.length() > 1) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name;
    }

    public String formatPersonalNumber(String personalNumber) {
        if (personalNumber.length() > 4) {
            return personalNumber.substring(0, 4) + "-" + personalNumber.substring(4);
        }
        return personalNumber;
    }

    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
