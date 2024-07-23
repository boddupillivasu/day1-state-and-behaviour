package com.variables.java;

public class LocalAndFinalVariable {

    String employeName ="areef";
    String name = "vasu naidu";

    public void Employe(){
        /*
        the local variable scope only with in the method only
         */

        int employeSalary = 10000; // local variables
        byte employeId = 13;
        String name = "vasu";
        System.out.println("employe id :"+employeId);
        System.out.println("employe salary:"+employeSalary);
        System.out.println("employe name:"+this.employeName);
        System.out.println("the local name is:"+name +"  "+"the insatnce name is:"+this.name);

    }

    public static void main(String[] args) {
        LocalAndFinalVariable localAndFinalVariable;
        localAndFinalVariable = new LocalAndFinalVariable();
        localAndFinalVariable.Employe();
    }

}
