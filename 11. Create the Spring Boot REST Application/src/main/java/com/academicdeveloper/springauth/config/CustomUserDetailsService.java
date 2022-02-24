package com.academicdeveloper.springauth.config;

/*
PROJECT NAME : 11. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/24/2022 9:55 PM
*/

import com.academicdeveloper.springauth.data.entities.User;
import com.academicdeveloper.springauth.data.reps.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        return new org.springframework.security.core.userdetails.
                User(user.getName(), user.getPassword(), user.getRoles());
    }
}
