package com.company;

public class ArrayDuplicate {

    public static void main(String[] args) {
	 //array duplicates
        int a[]=new int[] {1,2,3,2,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
