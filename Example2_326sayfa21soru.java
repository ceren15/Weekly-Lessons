
import java.util.Scanner;


public class Example2_326sayfa21soru {

    public static void main(String[] args) {
        /*
        N kişilik bir sınıfın herhangi bir dersten yıl sonu notlarını girilmektedir.Buna göre sınıf ortalamasının altında
        kalanlara "Kaldı", diğerlerine de "Geçti" yazan program.
        */
        Scanner oku=new Scanner(System.in);
        System.out.print("Sınıf mevcudunu giriniz : ");
        int N=oku.nextInt();
        int notlar[]=new int[N];
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i+1)+" inci not: ");
            notlar[i]=oku.nextInt();
        }
        int T=0;
        for (int i = 0; i <notlar.length; i++) {
            T+=notlar[i];
        }
        int ort=T/notlar.length;
        int gecen=0;
        for (int i = 0; i <notlar.length; i++) {
            if (notlar[i]>=ort) {
                System.out.println((i+1)+" inci öğrenci geçti. ");
                gecen++;
            }else{
                System.out.println((i+1)+" Öğrenci kaldı.");
            }
        }
        int kalan=notlar.length-gecen;
        System.out.println("Geçen öğrenci sayısı : "+gecen+" ve kalan öğrenci sayısı : " +kalan);
    }
    
}
