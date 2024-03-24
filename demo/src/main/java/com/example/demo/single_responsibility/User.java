package com.example.demo.single_responsibility;

public class User {

    private Long id;
    private String identity;
    private String firstName;
    private String lastName;
    private Integer birthYear;


    public User() {
    }

    public User(Long id, String identity, String firstName, String lastName, Integer birthYear) {
        this.id = id;
        this.identity = identity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", identity='" + identity + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
