package com.company.customerdataservice.controller;

import com.company.customerdataservice.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
    public void setUp() {}

    @Test
    public void shouldCreateCustomer() throws Exception {
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

        String inputJson = mapper.writeValueAsString(customer);
        mockMvc.perform(
                        post("/customers")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldUpdateCustomer() throws Exception {
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

        String inputJson = mapper.writeValueAsString(customer);
        mockMvc.perform(
                        put("/customers/1")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNoContent());
    }

    @Test
    public void shouldDeleteCustomerById() throws Exception {
        mockMvc.perform(
                        delete("/customers/1")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNoContent());
    }

    @Test
    public void shouldGetCustomerById() throws Exception {
        mockMvc.perform(
                        get("/customers/1")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldGetCustomersByState() throws Exception {
        Customer customer = new Customer();
        customer.setState("New York");

        String inputJson = mapper.writeValueAsString(customer);
        mockMvc.perform(
                        get("/customers")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

}
