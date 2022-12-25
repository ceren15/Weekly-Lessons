
package week5.pkgdo.pkgwhile;

import java.util.Scanner;

public class Week5DoWhile {

  
    public static void main(String[] args) {
     Scanner oku=new Scanner (System.in);
     int vize,fnl;
     do{
         System.out.println("Lütfen vize notunuzu giriniz.");
          vize=oku.nextInt();
          System.out.println("Lütfen final notunuzu giriniz.");
          fnl=oku.nextInt();
     } while(vize<0 || vize>100 || fnl<0 || fnl>100);
         double ort = vize*0.4 + fnl*0.6;
        
        if ( ort <=100 && ort >=80){
            System.out.println("Ortalamanız:" +ort + "ve harf notunuz: A");
        }
       else if(ort<=79 && ort>=60){
            System.out.println("Ortalamanız:" +ort+ "ve harf notunuz : B ");
        }
       else if(ort<=59 && ort>=50){
            System.out.println("Ortalamanız:" +ort+ "ve harf notunuz : C ");
        }
        else{
            System.out.println("Ortalamanız:"+ort+"ve harf notunuz : D ");
        }
        
        
     
        
     }
    
}
