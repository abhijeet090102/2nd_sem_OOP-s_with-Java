/* . Write a Java Program to implement bubble sort . */
import java.io.*;
import java.util.*;
class BubbleSort {
    public static void main(String[] args){
        int[] am = {4,6,8,2,40,20,48,3,5};
        int temp;
        for (int i=1; i<am.length; i++){
            int c = 0;
            for (int j=0; j<am.length-i; j++){
                if (am[j] > am[j+1] ){
                    temp = am[j];
                    am[j] = am[j+1];
                    am[j+1] = temp;
                    c = c+ 1;
                }
            }
            if (c == 0){
                break;
            }
            
        }
        for (int i=0; i<10; i++){
            System.out.println(am[i]);
        }
        
    }
}