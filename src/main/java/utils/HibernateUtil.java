package utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HibernateUtil {
    private static final SessionFactory sessionFactory
            = configureSessionFactory();
    private static ServiceRegistry serviceRegistry;

    /**
     * Создание фабрики
     * @return {@link SessionFactory}
     * @throws HibernateException
     */
    private static SessionFactory configureSessionFactory()
            throws HibernateException {

        Configuration configuration = new Configuration().configure();
        serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Logger log = Logger.getLogger("org.hibernate");
        log.setLevel(Level.OFF);
        return configuration.buildSessionFactory(serviceRegistry);
    }

    /**
     * Получить фабрику сессий
     * @return {@link SessionFactory}
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}