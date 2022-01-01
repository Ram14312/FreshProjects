package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value for n");
        int n=scan.nextInt();
        int n1=0,n2=1,n3=0;
        System.out.println(n1+""+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;n2=n3;
        }


    }
}
