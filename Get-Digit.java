package javaapplication6;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication6 {

 static int get (int x , int i )
 {
     return (x/(int)Math.pow(10, i)%10);
 }
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     //int x = input.nextInt();
     
    int y = 12345;
        int l = (y+"").length();// حجم الرقام السايز 
  
        int a = 0 , b = l-1;
        System.out.println(" ");
        for (int i = 0; i <l/2; i++) {
            System.out.print(get(y,b) + " " + get(y,a) + " ");
            a++;
            b--;
            
        }
     if(l%2 != 0)
     {
         System.out.println(get(y,a));
     }
    }
} 