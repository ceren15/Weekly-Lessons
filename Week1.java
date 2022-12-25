
import java.util.Scanner;


public class Week1 {

    public static void main(String[] args) {
           /*
    1.Başla.
    2.Kullanıncıdan üçgenin kenarlarını (a,b,c) al.
    3.Eğer a==b==c ise yaz eşkenar üçgendir.
    4.Eğer a==b && a!=b || a==c && a!=c || b==c && a!=b ise yaz ikizkenar üçgendir.
    5.Eğer a!=b && b!=c && a!=c ise yaz çeşitkenar üçgendir.
    6.Bitir.
    */
       
      Scanner oku=new Scanner(System.in);
        System.out.println("Üçgenin ilk kenarını giriniz.");
        int a=oku.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz.");
        int b=oku.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz.");
        int c=oku.nextInt();
        
        if(a==b && b==c){
            System.out.println("Eşkenar üçgendir.");
        }
        if(a!=b && b!=c && a!=c){
            System.out.println("Çeşit kenar üçgendir.");
        }
        else if (a==b && b!=c || a==c && a!=b || b==c && a!=b){
            System.out.println("İkizkenar üçgendir.");
        }
    }
    
}
