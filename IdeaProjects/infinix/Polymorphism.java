package com.company;
public class Polymorphism extends Main{
    public void Motor(){
        System.out.println("Motor on");
    }
    public void Engine(){
        System.out.println("Engine on");
    }
    @Override
    public void Wheeling(){

        System.out.println("Wheeling can not be done");
    }
}
