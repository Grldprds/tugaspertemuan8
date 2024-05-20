/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8;

/**
 *
 * @author Geral
 */
import java.util.Date;

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day);
    }
}

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ", Status: " + status;
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + ", Office: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString() + ", Title: " + title;
    }
}

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Geral Septira Alfarizi Rades", "Pamijahan, Bogor", "081387925734", "geralpradesa@gmail.com");
        Student student = new Student("Danis", "Bandung", "0821312488", "danis@upi.edu", Student.SENIOR);
        MyDate dateHired = new MyDate(2020, 5, 20);
        Employee employee = new Employee("Sahrul", "Subang", "08781237182", "sahrul@gmail.com", "Room 101", 50000, dateHired);
        Faculty faculty = new Faculty("Prof. Tayo", "Karawang", "08821893123", "tayo@upi.edu", "Room 202", 75000, dateHired, "9am-5pm", "Professor");
        Staff staff = new Staff("Habibi", "Jambi", "0821937127", "habibi@gmail.com", "Room 303", 40000, dateHired, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

