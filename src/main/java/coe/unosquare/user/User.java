package coe.unosquare.user;

import java.util.Optional;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private Optional<String> savings;

    public User(String id, String lastName, String firstName, Optional<String> savings) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.savings = savings;
    }

    public String getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Optional<String> getSavings() {
        return savings;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", savings=" + savings.get() +
                '}';
    }
}
