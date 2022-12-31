
import java.util.Scanner;


public class Example4 {

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
        
        int maxrow=0,maxcol=0,minrow=0,mincol=0;//index değeri min ve maxların
        int maxelement= A[0][0] , minelement=A[0][0];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j]>maxelement) {
                    maxelement=A[i][j];
                    maxrow=i; maxcol=j;
                }
                if (A[i][j]<minelement) {
                    minelement=A[i][j];
                    minrow=i; mincol=j;
                }
            }
        }
        System.out.println("max " + maxelement + " ve satır indisi " + maxrow + " ve sütun indisi " + maxcol);
        System.out.println("min " + minelement + " ve satır indisi " + minrow + " ve sütun indisi " + mincol);

        
    }
    
}
