
import java.util.Scanner;


public class Example1_315sayfa8soru {
//DİZİYİ TERSTEN YAZILMASI !!! ÖNEMLİ BİR ÖRNEK HOCA VURGULADII!!
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz : ");
        int N=oku.nextInt();
        int a []=new int[N];
        
        for (int i = 0; i <a.length; i++) {
            System.out.print((i+1)+" inci sayi: ");
            a[i]=oku.nextInt();
        }
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[N-1-i];
            a[N-1-i]=temp;
                
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
                
    }
    
}
