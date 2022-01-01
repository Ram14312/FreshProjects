package com.Infinite.PracticeApp;

public class LaunchMain {
    public static void main(String[]args){
        Polymorphism p=new Polymorphism();
        Humanbeing h= new Humanbeing();
        Woman w=new Woman();
        Man m=new Man();

        p.Function(m);
        p.Function(h);
        p.Function(w);

    }
}
