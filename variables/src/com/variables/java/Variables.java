package com.variables.java;

public class Variables {
    // instance variables

    /*
    instance variables we can create inside the class and before the main method
    we can create an object for set the memory is allocated on the top of heap memory
    for every object a separate copy of instance variable available
    ex: 10 instance variables for create 10 objects for 10 memory locations in the heap memory
     */

    /*
    we  can declare  static variable using static keyword
    static variable and static memory is allocated   method area only once
     */

    static

    String customerName;
    int customerAge;
    int getCustomerSalary;
    // static variables

    static String customerCode = "cv";

    // instance method
    /*
    here we use this ey
     */
    public void customerDetails() {
        System.out.println("--- customer details are ---");
        System.out.println("customer name :" + this.customerName);
        System.out.println("customer age :" + this.customerAge);
        System.out.println("customer salary :" + this.getCustomerSalary);
        System.out.println("the college code :" +Variables.customerCode);

    }

    public static void main(String[] args) {
        /*
        when ever we create main method it created memory for static variables and methods
         */
        Variables variables;
        variables = new Variables();
        variables.customerDetails();

        Variables variables1;
        variables1 = new Variables();
        variables1.customerName = "vasu";
        variables1.customerAge = 23;
        variables1.getCustomerSalary = 5000;

        variables1.customerDetails();

        // static varible and static method access only class name
        System.out.println("the college code :" +variables1.customerCode);// not recommend


        System.out.println("the college code :" +Variables.customerCode);


    }


}
