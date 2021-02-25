package com.example.users.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id) {
        UserResponse userResponse = new UserResponse(id, "Jengweb", "jengweb@gmail.com");
        return userResponse;
    }
}
