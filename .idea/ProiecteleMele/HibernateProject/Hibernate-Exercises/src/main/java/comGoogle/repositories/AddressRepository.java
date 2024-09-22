package comGoogle.repositories;

import comGoogle.entities.Address;
import comGoogle.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AddressRepository {
    public void createAddress(Address address){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();

    }
    public Address getAddressById(int id){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
       Address address = session.get(Address.class,id); //
        session.getTransaction().commit();
        session.close();
        return address;
    }
    public void updateAddress(Address address){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.update(address);
        session.getTransaction().commit();
        session.close();

    }
    public void deleteAddress(int id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
       Address address = getAddressById(id);
       if(address != null){
           session.delete(address);
       }
        session.getTransaction().commit();
        session.close();
    }
}

