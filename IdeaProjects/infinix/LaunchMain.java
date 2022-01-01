package com.company;
public class LaunchMain {
    public static void main(String[]args) {

        Inheritance i = new Inheritance();
        Polymorphism p = new Polymorphism();
        Proff pf = new Proof();
        Main m;
        m = i;
        m.Motor();
        m.Engine();
        m.Wheeling();
        m = p;
        m.Motor();
        m.Engine();
        m.Wheeling();
        m = pf;
        m.Motor();
        m.Engine();
        m.Wheeling();
    }


}
