package utils;

import model.Auto;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    private static Session session;

    public static Session getSession() {
        if (session == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Auto.class);
                session = configuration.buildSessionFactory().openSession();

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return session;
    }

}
