package dao;

import model.Auto;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDaoImpl implements UserDao{

    private Session session;

    @Override
    public User findUserById(int id) {
        session = HibernateSessionFactoryUtil.getSession();
        return session.get(User.class, id);
    }

    @Override
    public void save(User user) {
        session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(User user) {
        session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        session = HibernateSessionFactoryUtil.getSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    @Override
    public Auto findAutoById(int id) {
        session = HibernateSessionFactoryUtil.getSession();
        return session.get(Auto.class, id);
    }

    @Override
    public List<User> findAll() {
        session = HibernateSessionFactoryUtil.getSession();
        List users = session.createQuery(
                "FROM User").list();
        return users;
    }
}
