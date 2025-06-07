public class Person {
    private String firstName, lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString() {
        return lastName + " " + firstName + ", " + address;
    }
}
