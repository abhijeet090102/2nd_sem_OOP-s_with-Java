/*  Write a Java Program to implement array of objects. */

import java.io.*;
import java.util.*;
class Array{
    Array(){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int st = a.nextInt();
        int[] am = new int[st];
        for (int i=0; i<am.length; i++){
            System.out.print("Enter the array values :");
            am[i] = a.nextInt();
        }
        for (int i:am){
            System.out.println(i);
        }
        
    }
}
class Array_Obj {
    public static void main(String[] args){
        Array obj = new Array();
        
    }
}
