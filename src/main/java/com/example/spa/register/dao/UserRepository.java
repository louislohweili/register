package com.example.spa.register.dao;
import java.util.List;

import com.example.spa.register.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository <User, Integer> {


    // add a method to sort by last name
    public List<User> findAllByOrderByLastNameAsc();

    // search by name
    public List<User> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}