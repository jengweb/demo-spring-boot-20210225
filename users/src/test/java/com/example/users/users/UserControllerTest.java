package com.example.users.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void success_get_user_id_1() {
        UserResponse result = restTemplate.getForObject("/users/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("Jengweb", result.getName());
        assertEquals("jengweb@gmail.com", result.getEmail());
    }
}