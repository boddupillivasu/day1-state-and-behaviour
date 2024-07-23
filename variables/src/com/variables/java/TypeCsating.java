package com.variables.java;

public class TypeCsating {
    public static void main(String[] args) {
        // type casting

        // implicit conversion

        System.out.println("--- the implicit conversion");

        int number;
        number = 100;
        System.out.println("the integer value :" + number);
        double data;
        data = number;
        System.out.println("the double value :" + data);

        char name;
        name ='j';
        System.out.println("yhe char value :"+name);
        int n;
        n=name;
        System.out.println("yhe integer value :"+n);

        // expilicit conversion
        System.out.println("--- the explicit conversion ---");
        double d;
        d = 100.23;
        int a= (int)d;
        System.out.println("the integer value :"+a);


        float value;
        value =13.0f;
        byte b;
        b= (byte) value;
        System.out.println("the byte value:"+b);


        double df;
        df =100;
        char ch = (char) df;
        System.out.println("the char is:"+ch);



    }

}
