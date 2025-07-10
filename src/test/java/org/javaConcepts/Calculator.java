package org.javaConcepts;

public class Calculator {
    public void add(int a, int b)
    {
         System.out.println(a+b);
    }

    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public void add(double a, double b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(5,4);
        cal.add(4.5,5.5);
        cal.add(2,3,4);
    }
}

//Same method name but different type of parameters or different count of parameters
