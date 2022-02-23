package com.academicdeveloper.springauth.data.entities;

/*
PROJECT NAME : 11. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/23/2022 11:31 PM
*/

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private Integer id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String password;

    @ManyToMany
    @JoinTable(name="user_role",
            joinColumns =
                    {@JoinColumn(name = "user_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
