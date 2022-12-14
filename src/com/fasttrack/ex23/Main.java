package com.fasttrack.ex23;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Mihai", "Garle");
        person.setBirthday(1995, 05, 25);

        System.out.println(person.fullName());
        System.out.println(person.age());

        Programmer programmer = new Programmer("Alex", "Mihalcea");
        programmer.setBirthday(1995, 07, 25);

        System.out.println(programmer.fullName());
        System.out.println(programmer.age());

        DatebaseAdmin databaseAdmin = new DatebaseAdmin("Gica", "Mihai");
        databaseAdmin.setBirthday(1995, 06, 25);

        System.out.println(databaseAdmin.fullName());
        System.out.println(databaseAdmin.age());
    }
}
