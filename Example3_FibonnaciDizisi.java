
import java.util.Scanner;
//Fibonacci dizisini yazdırma.

public class Example3_FibonnaciDizisi {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        int N=oku.nextInt();
        int fiboc[]=new int[N];
        fiboc[0]=1;
        fiboc[1]=1;
        for (int i =2 ; i <fiboc.length; i++) {
            fiboc[i]=fiboc[i-1]+fiboc[i-2];
        }
        for (int i = 0; i <fiboc.length; i++) {
            if (i==fiboc.length-1) {
                System.out.print(fiboc[i]);
            }else{
                System.out.print(fiboc[i]+" ,");
            }
        }
    }
    
}
