package Lection3.Ex003;

import java.util.Iterator;

public class Worker implements Iterator<String> {

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String FullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("First Name: %s", firstName);
            case 2:
                return String.format("Last Name: %s", lastName);
            case 3:
                return String.format("Age: %d", age);
            default:
                return String.format("Salary: %d", salary);
        }
    }
}
