package com.driver;

public class Main {

    public static void main(String args[])
    {
        RWOnly r1 = new RWOnly();
//        r1.name = "IronMan";
//        System.out.println(r1.name);
//        error:-
//        java: name has private access in com.driver.RWOnly

        r1.setName("IronMan");
        System.out.println(r1.getName());
    }
  
}