package com.company;

public class Calculation {

    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static int cube(int n){
        return n*n*n;
    }
    //method that returns reverse words
    public static String reverseWord(String str){

       /* StringBuilder result=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(str," ");

        while(tokenizer.hasMoreTokens()){
            StringBuilder sb=new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();*/
 // String str =new String("ram");
            //result.append(s);
            //result.append(" ");
        String str1="";
        for(int i=str.length()-1;i>=0;i--){

                str1+=str.charAt(i);
            }


        return str1;

        }
       // return result.toString();
    }




