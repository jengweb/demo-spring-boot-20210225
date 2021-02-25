package com.example.users.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable String id) {
        int _id = -1;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            throw new UserInputInvalidException("Invalid id with " + id);
        }

        UserResponse userResponse = new UserResponse(_id, "Jengweb", "jengweb@gmail.com");
        return userResponse;
    }
}
