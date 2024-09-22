package comGoogle.repositories;

import comGoogle.entities.Person;
import comGoogle.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonRepository {
    public void createPerson(Person person){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(person);

        session.getTransaction().commit();

        session.close();


    }

    public void updatePerson(Person person){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(person);
        session.getTransaction().commit();
        session.close();
    }
    public Person getPersonById(int id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Person person =  session.get(Person.class, id); //TODO cu metoda get cautam ,
        //TODO si ea se asteapta sa primeasca Clasa<T> adica la noi Person si Serializable care inseamna id
        //serializable -> inseamna ca implementeaza interfata Serializable si el sa poata fi transformat intr-un byte array
        session.getTransaction().commit();

        session.close();


        return person;
    }

    public void deletePerson(int id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Person person = getPersonById(id);

        if(person != null){
            session.delete(person);
        }
        session.getTransaction().commit();
        session.close();
    }
}
