package org.javaConcepts;


//Variable,Method,Class --> final
public class FinalKeyword {

    final void showMessage()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        final int x = 10;

        //x = 20;

        System.out.println(x);
    }

}
