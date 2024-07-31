package com.example.gpxlocationmqtt.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Create logic to load user from database.
        return new org.springframework.security.core.userdetails.User(username, "$2a$10$7QJZT6eB0D1UV/oT8vUIUe9OGcsfv8g6XaXKZj09qlBz4fO6jIz9i", new ArrayList<>());
    }
}
