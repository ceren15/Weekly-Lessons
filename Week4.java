package week4;

import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {
     Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        int faktoriyel=1;
        int i=1;
        while(i<=N)
         {
             faktoriyel=faktoriyel*i;
             i=i+1;
         }
       
        System.out.println("faktoriyel:"+ faktoriyel);
        
        
        
        
        
        
    }
    
}
