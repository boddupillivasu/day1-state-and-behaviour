package com.polymorphysm.java;

public class Polymorphysm {

//    public void method() {
//        System.out.println("this is method one");
//    }
//
//    public int method(int a, int b) {
//        return a + b;
//
//    }
//
//    public double method(double x, double y, double z) {
//        return x + y + z;
//
//
//    }


    public int add(int a, int b) {
        System.out.println("this is a int method");
        return a + b;
    }

    public double add(double x, double y) {
        System.out.println("this is a double method");
        return x * y;
    }

    public float add(float a, float b) {
        System.out.println("this is a float method");
        return a + b;
    }

    public static void main(String[] args) {
        Polymorphysm polymorphysm;
        polymorphysm = new Polymorphysm();

        System.out.println(polymorphysm.add(10, 2));

        System.out.println(polymorphysm.add(23.7, 26.8));
    }
}

