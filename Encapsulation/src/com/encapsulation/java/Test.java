package com.encapsulation.java;

public class Test {
    public static void main(String[] args) {

        Encapsulation encapsulation;
        encapsulation = new Encapsulation();


 // displaying actual data
        encapsulation.setId(13);
        encapsulation.setValue(14);
        encapsulation.setName("vasu");

        System.out.println("the name is:"+encapsulation.getValue() );
        System.out.println("the id is:"+encapsulation.getId());
        System.out.println("the value is:"+encapsulation.getName());



       // encapsulation.display();



    }
}
