package coe.unosquare.user;

public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double savings;

    public User(Integer id, String lastName, String firstName, Double savings) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.savings = savings;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getSavings() {
        return savings;
    }

    public void setSavings(Double savings) {
        this.savings = savings;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", savings=" + savings +
                '}';
    }
}
