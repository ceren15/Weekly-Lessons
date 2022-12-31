
import java.util.Scanner;


public class Example2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int row1=input.nextInt();
        System.out.println("Sütun sayısını giriniz : ");
        int col1=input.nextInt();
        int[][] A=new int[row1][col1];
        
        System.out.println("B'nin satır sayısı A'nın sütun sayısı");
        int row2=col1;
        System.out.println("B'ye ait sütun sayısı : ");
        int col2=input.nextInt();
        int[][] B=new int[row2][col2];
        
        System.out.println("A matrisi : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println(i+"inci satır ve "+j +"inci sütun");
                A[i][j]=input.nextInt();        
            }
            
        }
        System.out.println("B matrisi ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println(i+"inci satır ve "+j +"inci sütun");
                B[i][j]=input.nextInt();
            }
        }
        
        System.out.println("AXB matrisi : ");
        int[][] C =new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        
        for (int i = 0; i <row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println(C[i][j]+ " ");
            }
        }
    }
}
