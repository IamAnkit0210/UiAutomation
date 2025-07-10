package org.javaConcepts;


//Parent class--> Animal2
//Child Class-->DogClass

//Child class is inheriting properties of parent class

public class DogClass extends Animal2{
    @Override
    public void makeSound()
    {
        System.out.println("Dog barks");
    }
}
