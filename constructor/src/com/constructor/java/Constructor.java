package com.constructor.java;

public class Constructor {

    // instance variables
    String pNmae;
    int pprice;
    String pBrand;

    // default constructor

    public Constructor() {
        this("java", 1200, "ece"); // calling argument constructor
        System.out.println("--- this is a default constructor ---  ");

    }

    public Constructor(String pNmae, int pprice, String pBrand) {

        //this();//calling default constructor
        System.out.println(" --- tis is a argument constructor ---");
        this.pNmae = pNmae;
        this.pprice = pprice;
        this.pBrand = pBrand;
    }

    // instance method
    public void displayDetails() {
        System.out.println("this is a method 1");
    }

    // instance method
    public void display() {
        this.displayDetails();// calling the method by using this keyword
        System.out.println("the product name:" + this.pNmae);
        System.out.println("the product price:" + this.pprice);
        System.out.println("the product brand:" + this.pBrand);

        //this.displayDetails();
    }


    public static void main(String[] args) {

        Constructor constructor;
        constructor = new Constructor();
        constructor.display();

        Constructor constructor1;
        constructor1 = new Constructor("laptop", 35000, "lenovo");
        constructor1.display();

    }

}
