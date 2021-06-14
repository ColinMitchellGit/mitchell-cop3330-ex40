/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex40;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", "Johnson", "Manager", LocalDate.of(2016, 12, 31)),
                new Employee("Tou", "Xiong", "Software Engineer", LocalDate.of(2016, 10, 5)),
                new Employee("Michaela", "Michaelson", "District Manager", LocalDate.of(2015, 12, 19)),
                new Employee("Jake", "Jacobson", "Programmer", null),
                new Employee("Jacquelyn", "Jockson", "DBA", null),
                new Employee("Sally", "Webber", "Web Developer", LocalDate.of(2015, 12, 18))
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        String target = input.nextLine();

        System.out.println("\nResults:\n");

        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Separation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));

        for(Employee Employee : employees) {
            String temp;

            if(Employee.separationDate == null) {
                temp = "";
            }
            else {
                temp = Employee.separationDate.toString();
            }
            if(Employee.firstName.contains(target) || Employee.lastName.contains(target)) {
                System.out.printf("%-20s | %-20s | %-20s\n",  Employee.firstName + " " + Employee.lastName, Employee.position, temp);
            }
        }
    }
}