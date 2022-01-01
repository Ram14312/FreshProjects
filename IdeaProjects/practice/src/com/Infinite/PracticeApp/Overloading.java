package com.Infinite.PracticeApp;

public class Overloading {
    public static void main (String[]args){
       /* System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,12,13));*/
        Adder a=new Adder();
        System.out.println(a.add(11,11));
        System.out.println(a.add(11,12,13));

    }
}
