
import java.util.Random;
import java.util.Scanner;


public class Example5 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Ders sayısını giriniz : ");
        int M =input.nextInt();
        System.out.println("Öğrenci sayısını giriniz : ");
        int N =input.nextInt();
        
        int[][]notlar= new int [M][N];
        int []ogrencino=new int [N];
        double []ortalamalar =new double [M];
        int[][] rapor= new int [M][4];
        
        Random r=new Random();
        for (int i = 0; i < N; i++) {
            ogrencino[i]=(int) (10000+(20000-10000)*r .nextDouble());
        }
        //rastgele 0-99 arası not dizisini atama 
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                notlar[i][j]=r .nextInt(100);
            }
        }
        
        for (int i = 0; i < M; i++) {
            int toplam=0;
            for (int j = 0; j < N; j++) {
                toplam+=notlar[i][j];
            }
            ortalamalar[i]= (double) toplam/N;
        }
        
        for (int i = 0; i < M; i++) {
            int max =notlar[i][0], min= notlar[i][0];
            int maxid=0, minid=0;
            for (int j = 0; j < N; j++) {
                if (notlar[i][j]>max) {
                    max=notlar[i][j];
                    maxid=ogrencino[j];
                }
                if (notlar[i][j]<min) {
                    min=notlar[i][j];
                    minid=ogrencino[j];
                }
            }
            rapor[i][0]=max; rapor[i][1]=maxid; min=rapor[i][2]; minid=rapor[i][3];
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(" ");
                System.out.println(ortalamalar[i]);
                System.out.println("max not "+ notlar[i][j]+ " maxid "+ogrencino[j]);
                System.out.println("min not "+ notlar[i][j]+" minid "+ ogrencino[j]);   
                break;
            }     
        }  
    } 
}
