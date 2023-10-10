package net.elbahja.backendspring.controller;

import net.elbahja.backendspring.model.User;
import net.elbahja.backendspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }
}
