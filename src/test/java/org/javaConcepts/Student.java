package org.javaConcepts;

public class Student {
    String name;
    int rollNumber;
    static String schoolName = "DPS";

    Student(String name, int rollNumber)    //Parameterised constructor
    {
        this.name = name;
        this.rollNumber =rollNumber;
    }

    public void display()
    {
        System.out.println(name + "   "  + rollNumber + "    "  + schoolName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mark", 12);
        s1.display();

        Student s2 = new Student("James", 11);
        s2.display();

        //How to access a static variable--> ClassName.variableName
        System.out.println(Student.schoolName);

        Student.schoolName = "ABC School";
        s1.display();
        s2.display();
    }
}

//Class, Objects, Methods, Variables
//Access Specifier--> public, private, protected
//static variables--> Access
//Constructor--> this keyword
//Final Keyword
//Interface

//Polymorphism= Many + Forms
//1) Function Overloading --> Compile time
//2) Function overriding --> Run time


