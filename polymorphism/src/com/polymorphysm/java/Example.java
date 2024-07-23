package com.polymorphysm.java;

public class Example {
     public void add( char a , char b){
         System.out.println("this is a char method");
         System.out.println(a+""+b);

     }
//     public  void  add( int a , int b){
//         System.out.println("this is a int method");
//         System.out.println("sum is "+ (a+b));
//     }
     public void add( double a, double b){
         System.out.println("this is a double method");
         System.out.println("sum is "+ (a+b));
     }

    public static void main(String[] args) {
        Example example;
        example = new Example();
        example.add('a','b');
        example.add(24,24);

    }
}
