
package week9;

import java.util.Scanner;

public class Week9 {

    public static void main(String[] args) {
        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        System.out.println(txt.charAt(4));
        char ch= txt.charAt(0);
        System.out.println(ch+ "'nin ASCII kodu : " +(int)ch);
        System.out.println(ch+1);
        
        char ch2='e';
        System.out.println(ch2+ "'nin ASCII kodu : " +(int)ch2);
        
        char ch3='3';//3 karaktedir sadece harflerin kodu yoktur sayılarında var.
        System.out.println(ch3+ "'nin ASCII kodu : " +(int)ch3);
        */
        
        
        
        
        /*
        //Bütün harflerin ASCII kodu 
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i <= txt.length()-1; i++) {
            System.out.println(txt.charAt(i)+" nin ASCII kodu : "+(int)txt.charAt(i));
        }
        //Yazdığımız ifadenin 0 .indisi yazdırır bize.Yani ceren yazdığımızda 0.indis c 75 olduğundan a da 75 olur.
        int a=txt.charAt(0);
        System.out.println("a'nın değeri : "+a);
        
        //a'nın kendi değerini yazdırdık.
        int a='%';
        System.out.println("a'nın değeri : "+a);
         
        */
        
        
        
        
        /*
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        System.out.println("Lütfen bir harf giriniz: ");
        char ch=input.nextLine().charAt(0);
        
        int sayac=0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i)==ch) {
                System.out.println((i+1)+ ",");
                sayac++;
            }
        }
        System.out.println(ch+" " +sayac+" kadar cümlede seçilmektedir.");
        
        */
        
        
        
        /*
        
        //Tersten yazılışı
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i =txt.length()-1; i >=0; i--) {
            if (i!=0) {
                System.out.println(txt.charAt(i)+ ",");
            }
            else{
                System.out.println(txt.charAt(i));
            }
            System.out.println(txt.charAt(i));
        }
        
        */
        
        
        
        /*
        //Girilen cümleyi tersten yazma ve büyük/küçük yazdırma.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        int sayac=0;
        
        for (int i =txt.length()-1; i >=0; i--) {
            if (sayac%2==0) {
                System.out.println(Character.toLowerCase(txt.charAt(i)));//Büyüterek yazdırma
            }else{
                System.out.println(Character.toUpperCase(txt.charAt(i)));//Küçülterek yazdırma
            }
            sayac++;
        }

         */
    
        
         /*   
        //Klavyeden küçük harflerle girilen bir cümledeki sesli harflerin sayısını ve cümledeki yerlerini bulma.
        //SINAVDAA SORABİLİRR İYİ ANLAA.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        char[] sesli ={'e','a','i','u','o'};//boşluğuda sayıyor oda bir karakterdir.
        int[] yer=new int[255];
        int sayac=0;
        for (int i = 0; i <= txt.length()-1; i++) {//sesli harflerim küçük harflerden oluştuğu için küçültüp kontrol ediyoruz.
            char h=Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j <=sesli.length-1; j++) {
                if (sesli[j]==h) {
                    //System.out.println((i+1)+" inci karakter : "); 
                    yer[sayac]=i;
                    sayac++;
                }
            }
        }
        
        for (int i = 0; i < sayac; i++) {
            System.out.println(yer[i]+" ,");
        }
        System.out.println("Toplam sesli harf : "+ sayac);
        
      */  
         
         
         /*
         //Klavyeden girilen bir kelimeyi her harfinden sonra sırasını gösteren sayıyı da yanına koyarak yazdıran.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt =input.nextLine();
        for (int i = 0; i <txt.length(); i++) {
            System.out.println(txt.charAt(i)+""+(i+1));//Yan yana yazdırmak için.
           // System.out.println(i+1);
        }
        
        */
         
         
        /*
         //7.39 soru.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length()/2; i++) {
            System.out.println(Character.toLowerCase(i));
            System.out.println(Character.toLowerCase(txt.length()-1-i));
        }
        
        if (txt.length()%2==1) {
            System.out.println(Character.toLowerCase(txt.charAt(txt.length()/2)));
        }
        
        */
        
        //Klavyeden girilen bir cümlede kaç tane kelime olduğunu bulan.
        //!!sonucu yanlış çıkmasına bakmana gerek yokk.
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz: ");
        String txt=input.nextLine();
        char is[]={' ',',',';','-',':'};
        int say=0;
        for (int i = 0; i <txt.length(); i++) {
            char h=txt.charAt(i);
            for (int j = 0; j <is.length; j++) {
                if (h==is[j]) {
                    say++;
                   
                }
            }
        }
        System.out.println("Cümlede "+ say+ " tane kelime vardır.");
        
    }
    
}