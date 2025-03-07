package br.com.drianodev.springsecurityjwt.controller;

import br.com.drianodev.springsecurityjwt.model.User;
import br.com.drianodev.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void postUser(@RequestBody User user) {
        userService.createUser(user);
    }
}
