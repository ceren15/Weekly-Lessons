
package week6;

import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        Scanner oku=new Scanner (System.in);
        System.out.println("Satır sayısı giriniz.");
        int row=oku.nextInt();
        int b=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=b;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=row-b;a++){
                System.out.print("*");
            }
            b++;
            System.out.println();
        }
            
    }
    
}
