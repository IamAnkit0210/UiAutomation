package org.example;

public class StringConcept {

    public static void main(String[] args) {
        String s1 = "training";    //String literal approach
        String s2 = s1.replace('t','T');   // "Training" // new String Object

        String s3 = "Training";  //String literal approach
        System.out.println(s2 == s3);  //Address comparison
        // == compares the address & .equals() compares the values

        System.out.println(s2.equals(s3)); //Value comparison
    }
}
