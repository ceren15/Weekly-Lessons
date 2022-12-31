
package week10;

import java.util.Scanner;

public class Week10 { //İKİ BOYUTLU DİZİLER - MATRİSLER

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int row=input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int col=input.nextInt();
        int[][] A=new int[row][col];
        int[][] B =new int[row][col];
        int[][] C =new int[row][col];
        
        System.out.println("A matrisi : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i+"inci satır ve "+j +"inci sütun");
                A[i][j]=input.nextInt();    
            }
        }
        System.out.println("B matrisi ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i+"inci satır ve "+j +"inci sütun");
                B[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
          System.out.println();
          System.out.println("C matrisi ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                System.out.println(C[i][j]+ " ");
            }
        }
    }
}
