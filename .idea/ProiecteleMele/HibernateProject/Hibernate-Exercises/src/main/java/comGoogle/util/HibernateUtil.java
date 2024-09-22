package comGoogle.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  private static  SessionFactory sessionFactory ;

    private static SessionFactory buildSessionFactory() {
        return new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory != null){
            return sessionFactory;
        }
        sessionFactory = buildSessionFactory();
        return sessionFactory;

    }
}

