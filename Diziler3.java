
import java.util.Scanner;


public class Diziler3 {

    public static void main(String[] args) {
    
        Scanner oku=new Scanner(System.in);  //Dizinin uzunluğu
        System.out.println("Dizi uzunluğu :");
        int n=oku.nextInt();
        int[] sayi=new int[n];
        
        System.out.println(sayi[sayi.length-1]);
        System.out.println("Dizinin uzunluğu:" +sayi.length);
        
       
        for (int i = 0; i <= sayi.length-1; i++) { //sayı dizisine dışarıdan tamsayı değer atama
            System.out.print((i+1)+ " inci sayı : ");
            sayi[i]=oku .nextInt();
        }
        
       
        
        for (int i = 0; i <=sayi.length; i++) {//sayi dizisini yazdırma
            System.out.println(i+ " indis:" +sayi[i]);
        }
        
        
        
        int toplam=0;  //sayı dizisindeki elemanların toplamı
        for (int i = 0; i <=sayi.length-1; i++) {
            toplam+=sayi[i];
        }
        System.out.println("Toplam : " +toplam);
        
      
        
        //sayı dizisinin ortalaması
        double ort=(double) toplam/sayi.length;
        System.out.println("Ortalama : " +ort);
    } 
}
