package comGoogle;

import comGoogle.entities.Address;
import comGoogle.entities.IdentityCard;
import comGoogle.entities.Person;
import comGoogle.enums.Gender;
import comGoogle.repositories.AddressRepository;
import comGoogle.repositories.IdentityCardRepository;
import comGoogle.repositories.PersonRepository;

import javax.persistence.Id;
import java.util.Date;

public class MainApplication {
    public static void main(String[] args) {
       Person person = new Person();
        person.setLastName("Pitt");
        person.setFirstName("Brad");
        person.setDateOfBirth(new Date());
        person.setPlaceOfBirth("USA,Oklahoma");
        person.setGender(Gender.MALE);
        person.setNationality("Romana");

        PersonRepository personRepository = new PersonRepository();

        personRepository.createPerson(person);

        Person personScos = personRepository.getPersonById(1); //TODO am afisat o persoana de pe id 1, este exact ca un sout , doar ca nu aveam atribuit person la ceva, si a trebuit sa extragem din clasa Person si asa l am salvat in person

        System.out.println(personScos.getFirstName()); // todo apoi am facut sout cu obiectul salvat sus .getFirstName si ne va afisa numele

        person.setFirstName("Ion"); // i-am schimbat  numele in Ion inainte de update pentru ca nu avea ce sa ia din baza de date

        personRepository.updatePerson(person); // am facut update-ul dupa ce l-am modificat firstName in Ion

        Person personScos1 = personRepository.getPersonById(1);
        System.out.println(personScos1.getFirstName());

        // personRepository.getPersonById(1);

        // System.out.println();

        personRepository.deletePerson(1);

        Person personScos2 = personRepository.getPersonById(1);
        System.out.println(personScos2);

        //TODO TEMA ex 10
     //TODO Verifica functionalitatea metodelor  din repository ul entitatii Adress

     Address address = new Address();
     address.setId(1);
     address.setCountry("United Kingdom");
     address.setCity("Liverpool");
     address.setPostalCode("L6 7aa");
     address.setStreet("Kensington road");
     address.setNumber(8);
     address.setApartment("25");
     address.setFloor("1");
     address.setSector("Merseyside");


     AddressRepository addressRepository = new AddressRepository();
     addressRepository.createAddress(address);

     Address adresaScoasa = addressRepository.getAddressById(1);
     System.out.println(adresaScoasa.getCity());

     address.setCity("Manchester"); // am modificat orasul initial era Liverpool acum e Manchester dar tot nu ne afiseaza modificarea

     addressRepository.updateAddress(address);// am facut update la address in repository

     Address adresaScoasa2 = addressRepository.getAddressById(1);
     System.out.println(adresaScoasa2.getCity());

     //pasul 3 sa verificam daca e NULL

     addressRepository.deleteAddress(1);
     Address adresaScoasa3 = addressRepository.getAddressById(1);
     System.out.println(adresaScoasa3);

     //TODO TEMA Cu nr  11

     //VERIFICA FUNCTIONALITATEA METODELOR  DIN REPOSITORY-UL ENTITATI IDENTITYCARD
     IdentityCard identityCard = new IdentityCard();
     identityCard.setId(1);//id ul 1
     identityCard.setIssueDate(new Date(2014,7,18));//data emisa
     identityCard.setExpiryDate(new Date(2024,8,30));//data de expirare a buletinului
     identityCard.setSeries("1820311410618");//CNP
     identityCard.setIssuedBy("S.P.C.E.P Sector3");//Eliberata De SPCEP sector3

     IdentityCardRepository identityCardRepository = new IdentityCardRepository();
     identityCardRepository.createIdentityCard(identityCard);


     IdentityCard identityScos = identityCardRepository.getIdentityCardById(1);
     System.out.println(identityScos.getIssuedBy());
     //TODO De rezolvat,nu s-a facut update-ul pentru ca am folosit identityScos in loc de identityCard
     identityCard.setIssuedBy("SPCLEP Constanta");
     identityCardRepository.updateIdentityCard(identityCard);

     IdentityCard identityScos2 = identityCardRepository.getIdentityCardById(1);
     System.out.println(identityScos2.getIssuedBy());

     identityCardRepository.deleteIdentityCard(1);
     IdentityCard identityCard3 = identityCardRepository.getIdentityCardById(1);
     System.out.println(identityCard3);

























    }
}