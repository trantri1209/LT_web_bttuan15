package com.example.resolver;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver {
    @Autowired
    private UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    public User createUser(String fullname, String email, String password, String phone) {
        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        return userService.createUser(user);
    }

    public User updateUser(Long id, String fullname, String email, String phone) {
        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPhone(phone);
        return userService.updateUser(id, user);
    }

    public String deleteUser(Long id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }
}
