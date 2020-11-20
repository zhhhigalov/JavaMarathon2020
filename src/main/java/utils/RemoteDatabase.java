package utils;

import org.hibernate.Session;

import java.util.List;

public class RemoteDatabase {
    private static Session session;

    public static List<Organization> getAll() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Organization> organizations = session.createQuery("SELECT o FROM Organization o", Organization.class).getResultList();
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
        return organizations;
    }

    public static void save(Organization m) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
    }

}
