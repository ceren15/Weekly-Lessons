
import java.util.Scanner;


public class Example4 {

    public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);
        System.out.println("Lütfen bir satır sayısı giriniz.");
        int a=oku.nextInt();
        System.out.println("Lütfen bir sütun sayısı giriniz.");
        int b=oku.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
