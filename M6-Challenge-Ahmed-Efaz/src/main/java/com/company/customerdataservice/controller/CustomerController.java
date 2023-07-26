package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.company.customerdataservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/customers")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/customers/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void updateCustomerById(@PathVariable int id, @RequestBody Customer customer) {
        Optional<Customer> targetCustomer = customerRepository.findById(id);
        if (targetCustomer.isPresent()) {
            Customer updatedCustomer = new Customer();
            updatedCustomer.setCustomerId(id);
            updatedCustomer.setFirstName(customer.getFirstName());
            updatedCustomer.setLastName(customer.getLastName());
            updatedCustomer.setEmail(customer.getEmail());
            updatedCustomer.setCompany(customer.getCompany());
            updatedCustomer.setPhone(customer.getPhone());
            updatedCustomer.setAddress1(customer.getAddress1());
            updatedCustomer.setAddress2(customer.getAddress2());
            updatedCustomer.setCity(customer.getCity());
            updatedCustomer.setState(customer.getState());
            updatedCustomer.setPostalCode(customer.getPostalCode());
            updatedCustomer.setCountry(customer.getCountry());
            customerRepository.save(updatedCustomer);
        }
    }

    @DeleteMapping("/customers/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable int id) {
        Optional<Customer> targetCustomer = customerRepository.findById(id);
        if (targetCustomer.isPresent()) { customerRepository.deleteById(id); }
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Customer getCustomerById(@PathVariable int id) {
        Optional<Customer> targetCustomer = customerRepository.findById(id);
        if (targetCustomer.isPresent()) { return targetCustomer.get(); }
        return null;
    }

    @GetMapping("/customers")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Customer> getCustomersByState(@RequestBody Customer customer) {
        return customerRepository.findByState(customer.getState());
    }


}
