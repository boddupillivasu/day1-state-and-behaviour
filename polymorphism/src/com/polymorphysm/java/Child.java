package com.polymorphysm.java;

public class Child extends Parent {

    public void add() {
        System.out.println("this is a method sub clas");
    }

    public void addNumber(int num) {
        System.out.println("this is a child  class:" + num);
    }

    public void Display() {

        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        /*
        it checks the first child class after it checks parent class
        and print the methods
         */
        Child child;
        child = new Child();
        child.addNumber(10);
        child.add();
        child.Display();

        // super class  reference  variable holding its subclass object
         /*
        it checks the first parent class after it checks child class
        and print the methods
         */
        Parent parent;
        parent = new Child();
        parent.addNumber(12);
        parent.add();
        //parent.diaplay();// this is not in the parent classs


    }
}
