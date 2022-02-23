package com.academicdeveloper.springauth.data.entities;

/*
PROJECT NAME : 11. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/23/2022 11:32 PM
*/

import java.util.Set;

public class Role {

    private Integer id;
    private String name;
    private Set<User> users;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
