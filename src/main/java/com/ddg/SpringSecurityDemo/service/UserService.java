package com.ddg.SpringSecurityDemo.service;

import com.ddg.SpringSecurityDemo.dao.UserRepo;
import com.ddg.SpringSecurityDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public User addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    public Object getAllUsers() {
        return repo.findAll();
    }
}
