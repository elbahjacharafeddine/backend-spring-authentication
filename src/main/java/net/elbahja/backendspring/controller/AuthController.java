package net.elbahja.backendspring.controller;

import net.elbahja.backendspring.model.Role;
import net.elbahja.backendspring.model.User;
import net.elbahja.backendspring.repository.UserRepository;
import net.elbahja.backendspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        user.setRole(Role.valueOf(Role.User.name()));
        userService.save(user);
        return user;
    }
}
