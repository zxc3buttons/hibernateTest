package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.Auto;
import model.User;

import java.util.List;

public class UserService {

    private UserDao usersDao = new UserDaoImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findUserById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }
}
