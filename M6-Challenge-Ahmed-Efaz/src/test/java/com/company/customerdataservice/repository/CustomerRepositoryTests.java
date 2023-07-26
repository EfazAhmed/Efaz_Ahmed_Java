package com.company.customerdataservice.repository;

import com.company.customerdataservice.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository customerRepository;

    @BeforeEach
    public void setUp() throws Exception {
        customerRepository.deleteAll();
    }

    @Test
    public void shouldCreateCustomer() {
        Customer customer = new Customer(
                "Efaz",
                "Ahmed",
                "efazahmed@gmail.com",
                "Netflix",
                "123-456-7890",
                "101 Wall Street",
                "57th Floor",
                "New York City",
                "New York",
                "12345",
                "USA"
        );

        customer = customerRepository.save(customer);
        Optional<Customer> customerFromDB = customerRepository.findById(customer.getCustomerId());
        assertEquals(customerFromDB.get(), customer);
    }

    @Test
    public void shouldUpdateCustomer() {
        Customer customer = new Customer(
                "Efaz",
                "Ahmed",
                "efazahmed@gmail.com",
                "Netflix",
                "123-456-7890",
                "101 Wall Street",
                "57th Floor",
                "New York City",
                "New York",
                "12345",
                "USA"
        );
        customer = customerRepository.save(customer);

        Customer updatedCustomer = new Customer(
                customer.getCustomerId(),
                "Efaz",
                "Ahmed",
                "efazahmed@gmail.com",
                "Netflix",
                "123-456-7890",
                "101 Wall Street",
                "57th Floor",
                "San Francisco",
                "California",
                "54321",
                "USA"
        );
        updatedCustomer = customerRepository.save(updatedCustomer);

        Optional<Customer> resultCustomer = customerRepository.findById(customer.getCustomerId());
        assertEquals(resultCustomer.get(), updatedCustomer);
    }

    @Test
    public void shouldDeleteCustomer() {
        Customer customer = new Customer(
                "Efaz",
                "Ahmed",
                "efazahmed@gmail.com",
                "Netflix",
                "123-456-7890",
                "101 Wall Street",
                "57th Floor",
                "New York City",
                "New York",
                "12345",
                "USA"
        );
        customer = customerRepository.save(customer);

        customerRepository.deleteById(customer.getCustomerId());
        Optional<Customer> resultCustomer = customerRepository.findById(customer.getCustomerId());
        assertEquals(resultCustomer.isPresent(), false);
    }

    @Test
    public void shouldGetCustomerById() {
        Customer customer = new Customer(
                "Efaz",
                "Ahmed",
                "efazahmed@gmail.com",
                "Netflix",
                "123-456-7890",
                "101 Wall Street",
                "57th Floor",
                "New York City",
                "New York",
                "12345",
                "USA"
        );
        customer = customerRepository.save(customer);

        Optional<Customer> customerFromDB = customerRepository.findById(customer.getCustomerId());
        assertEquals(customerFromDB.get(), customer);
    }

    @Test
    public void shouldGetCustomersByState() {
        // Create and save our customers to our repository
        Customer customer1 = new Customer(
                "Efaz", "Ahmed", "efazahmed@gmail.com", "Netflix",
                "123-456-7890", "101 Wall Street", "57th Floor", "New York City",
                "New York", "12345", "USA"
        );
        customer1 = customerRepository.save(customer1);
        Customer customer2 = new Customer(
                "Dalonte", "Griffin", "dgriffin@gmail.com", "Netflix",
                "123-456-7890", "101 Wall Street", "79th Floor", "Queens",
                "New York", "12345", "USA"
        );
        customer2 = customerRepository.save(customer2);
        Customer customer3 = new Customer(
                "Ted", "Sarandos", "tsarandos@gmail.com", "Netflix",
                "555-555-5555", "101 Wall Street", "102th Floor", "New York City",
                "New York", "12345", "USA"
        );
        customer3 = customerRepository.save(customer3);
        Customer customer4 = new Customer(
                "Spencer", "Neumann", "sneumann@gmail.com", "Netflix",
                "999-999-9999", "Tech Street", "13th Floor", "San Francisco",
                "California", "54321", "USA"
        );
        customer4 = customerRepository.save(customer4);
        Customer customer5 = new Customer(
                "Reed", "Hastings", "rhastings@gmail.com", "Netflix",
                "222-222-2222", "Tech Street", "15th Floor", "San Francisco",
                "California", "54321", "USA"
        );
        customer5 = customerRepository.save(customer5);

        // Test 1 -> New York
        String targetState = "New York";
        List<Customer> expectCustomers = Arrays.asList(customer1, customer2, customer3);
        List<Customer> resultCustomers= customerRepository.findByState(targetState);
        assertEquals(expectCustomers, resultCustomers);

        // Test 2 -> California
        targetState = "California";
        expectCustomers = Arrays.asList(customer4, customer5);
        resultCustomers= customerRepository.findByState(targetState);
        assertEquals(expectCustomers, resultCustomers);
    }

}
