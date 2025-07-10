package org.javaConcepts;

public class Animal {

    private String colour = "red";
    protected int legsCount = 4;
    public String eyeColour = "brown";
    private int makeSound()
    {
       int a = 10;
       System.out.println("This animal makes some sound");
       return a;
    }

    public double makeSound1()
    {
        double a = 10.1;
        System.out.println("This animal makes some sound1");
        return a;
    }
    public String makeSound11()
    {
        String a = "test";
        System.out.println("This animal makes some sound11");
        return a;
    }

//    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.makeSound11();
//        a.makeSound();
//        System.out.println(a.colour);
//    }
}
