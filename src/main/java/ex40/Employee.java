package ex40;
import java.time.LocalDate;

public class Employee {
    String firstName;
    String lastName;
    String position;
    LocalDate separationDate;

    public Employee(String firstName, String lastName, String position, LocalDate separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
}
