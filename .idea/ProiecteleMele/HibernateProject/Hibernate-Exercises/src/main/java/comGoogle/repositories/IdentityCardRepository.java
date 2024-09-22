package comGoogle.repositories;

import comGoogle.entities.IdentityCard;
import comGoogle.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class IdentityCardRepository {
    public void createIdentityCard(IdentityCard identityCard){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(identityCard);
        session.getTransaction().commit();
        session.close();

    }
    public IdentityCard getIdentityCardById(int id){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
       IdentityCard identityCard = session.get(IdentityCard.class,id);
        session.getTransaction().commit();
        session.close();
        return identityCard;
    }
    public void updateIdentityCard(IdentityCard identityCard){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(identityCard);
        session.getTransaction().commit();
        session.close();

    }
    public void deleteIdentityCard(int id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
       IdentityCard identityCard = getIdentityCardById(id);
       if(identityCard != null){
           session.delete(identityCard);
       }
        session.getTransaction().commit();
        session.close();
    }
}

