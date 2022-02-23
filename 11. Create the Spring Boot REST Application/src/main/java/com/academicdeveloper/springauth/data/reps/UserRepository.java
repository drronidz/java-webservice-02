package com.academicdeveloper.springauth.data.reps;

/*
PROJECT NAME : 11. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/23/2022 11:53 PM
*/

import com.academicdeveloper.springauth.data.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository {

    User findByName(String name);
}
