package net.elbahja.backendspring.service;

import net.elbahja.backendspring.model.User;
import net.elbahja.backendspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Object save(User user){
        try{
            userRepository.save(user);
            return user;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return (UserDetails) userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found with this email"));
            }
        };
    }
}
