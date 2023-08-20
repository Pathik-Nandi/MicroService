package com.miroservice.user.service.UserService.service;

import com.miroservice.user.service.UserService.entity.User;
import com.miroservice.user.service.UserService.exception.ResourceNotFoundException;
import com.miroservice.user.service.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUerId = UUID.randomUUID().toString();
        user.setUserId(randomUerId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User With give id is not found on server !!"+ userId));
    }
}
