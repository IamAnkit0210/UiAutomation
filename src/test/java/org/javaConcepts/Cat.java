package org.javaConcepts;

public class Cat extends Animal2{

    @Override
    public void makeSound()
    {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal2 d = new DogClass();
        d.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
