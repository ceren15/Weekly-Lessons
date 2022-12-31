
import java.util.Scanner;


public class Example3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        System.out.println("A matrisi : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(i+"inci satır ve "+j +"inci sütun");
                A[i][j]=input.nextInt();        
            }            
        }
        
        int sum=0;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                if (i<j) {
                  sum+=A[i][j];
                }
            }
        }    
        System.out.println("Ana köşegen üzeri toplam : "+sum);
    }
}
    
    

