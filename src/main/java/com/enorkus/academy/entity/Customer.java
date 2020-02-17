package com.enorkus.academy.entity;

public class Customer {

    private String id;

    //Mandatory
    private String firstName;
    private String lastName;
    private String personalNumber;

    //Optional
    private String middleName;
    private int age;
    private String countryCode;
    private String city;
    private int monthlyIncome;
    private String employer;
    private String gender;
    private String maritalStatus;


    public static class CustomerBuilder {
        private String id;

        //Mandatory
        private String firstName;
        private String lastName;
        private String personalNumber;

        //Optional
        private String middleName;
        private int age;
        private String countryCode;
        private String city;
        private int monthlyIncome;
        private String employer;
        private String gender;
        private String maritalStatus;

        public CustomerBuilder(String firstName, String lastName, String personalNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.personalNumber = personalNumber;
        }

        public CustomerBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public CustomerBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CustomerBuilder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public CustomerBuilder atCity(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder withMonthlyIncome(int monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
            return this;
        }

        public CustomerBuilder withEmployer(String employer) {
            this.employer = employer;
            return this;
        }

        public CustomerBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public CustomerBuilder withMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.id = id;
            customer.firstName = firstName;
            customer.lastName = lastName;
            customer.personalNumber = personalNumber;
            customer.middleName = middleName;
            customer.age = age;
            customer.countryCode = countryCode;
            customer.city = city;
            customer.monthlyIncome = monthlyIncome;
            customer.employer = employer;
            customer.gender = gender;
            customer.maritalStatus = maritalStatus;

            return customer;
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getGender() {
        return gender;
    }

    public String getEmployer() {
        return employer;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setId(String id) {
        this.id = id;
    }
}
