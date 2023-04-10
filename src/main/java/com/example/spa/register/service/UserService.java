package com.example.spa.register.service;
import java.util.List;
import com.example.spa.register.entity.User;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theEmployee);

    public void deleteById(int theId);

    public List<User> searchBy(String theName);

}
