package com.example.springtesting.contollers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(HelloControllers.class)
@ExtendWith(SpringExtension.class)
class HelloControllersIntTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }

    @Test
    void helloWithName() throws Exception {
        mockMvc.perform(get("/hello?name=Mah")).andExpect(content().string("Hello Mah"));
    }
}