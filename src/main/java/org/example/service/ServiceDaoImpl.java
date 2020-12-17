package org.example.service;

import org.example.models.User;

import java.util.List;

public interface ServiceDaoImpl {
    public List<User> index();
    public User show (int id);
    public void save (User user);
    public void update (User user);
    public void delete (int id);

}
