package com.academicdeveloper.springauth.config;

/*
PROJECT NAME : 11. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/24/2022 9:50 PM
*/

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService();
    }
}
