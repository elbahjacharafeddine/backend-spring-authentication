package net.elbahja.backendspring.controller;

import net.elbahja.backendspring.model.User;
import net.elbahja.backendspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAllUsers();
    }
    @PostMapping("/save")
    public Object save(User user){
        return userService.save(user);
    }
}
