package comGoogle.entities;

import comGoogle.enums.Gender;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persons")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

    private String firstName;

    private String lastName;

    @Enumerated
    private Gender gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String nationality;
    private String placeOfBirth;

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Person setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Person setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Person setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }
}
