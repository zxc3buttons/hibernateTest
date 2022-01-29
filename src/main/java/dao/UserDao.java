package dao;

import model.Auto;
import model.User;

import java.util.List;

public interface UserDao {

    User findUserById(int id);
    void save(User user);
    void update(User user);
    void delete (User user);
    Auto findAutoById(int id);
    List<User> findAll();

}
