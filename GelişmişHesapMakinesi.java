/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class GelişmişHesapMakinesi {
static void toplama(){
   Scanner input = new Scanner(System.in);
   System.out.print("İlk Sayı : ");
    int a = input.nextInt();
    System.out.print("İkinci Sayı : ");
    int b = input.nextInt();
    int result = a+b ;
    System.out.println("Toplama İşlemi = " +result);
    
   }
static void cıkarma(){
    Scanner input = new Scanner(System.in);
    System.out.print("İlk sayı  :");
    int a = input.nextInt();
    System.out.print("İkinci Sayı : ");
    int b = input.nextInt();
    int result = a-b;
    System.out.println("Çıkarma İşlemi = " +result);
}
static void carpma(){
    Scanner input = new Scanner(System.in);
    System.out.print("İlk sayı : ");
    int a = input.nextInt();
    System.out.print("İkinci Sayı : ");
    int b = input.nextInt();
    int result = a*b;
    System.out.println("Çarpma İşlemi = " +result);
}
static void bolme (){
    Scanner input = new Scanner(System.in);
    System.out.print("İlk sayı : ");
    int a = input.nextInt();
    System.out.print("İkinci Sayı : ");
    int b = input.nextInt();
    if(b == 0){
        System.out.println("Bir Sayı Sıfıra Bölünemez...");
    }
    else {
        int  result = a/b;
        System.out.println("Bölme İşlemi = " +result); 
    }
}
static void us(){
    Scanner input = new Scanner(System.in);
    System.out.print("Üssü Alınacak sayı : ");
    int a = input.nextInt();
    System.out.print("Üs Olacak Sayı : ");
    int b = input.nextInt();
    int result = 1;
    for(int i = 1; i<=b; i++){
        result *= a;
    }
    System.out.println("Üs Alma İşlemi = " +result);
}
static void fak(){
    Scanner input = new Scanner(System.in);
    System.out.print("Sayı Giriniz : ");
    int n = input.nextInt();
    int fak = 1;
    for(int i = 1; i<=n; i++){
        fak *= i;
    }
    System.out.println("Faktöriyel = " +fak);
}
static void mod(){
    Scanner input = new Scanner(System.in);
    System.out.print("Mod Alınacak Sayı : ");
    int a = input.nextInt();
    System.out.println("Mod Sayısını Giriniz : ");
    int b = input.nextInt();
    int result = a%b;
    System.out.println("Mod Alma İşlemi = " +result);
}
static void dik(){
    Scanner input = new Scanner(System.in);
    System.out.println("Dikdörtgenin Uzun Kenarını Giriniz : ");
    int a = input.nextInt();
    System.out.print("Dikdörtgenin Kısa Kenarını Giriniz : ");
    int b = input.nextInt();
    int cevre = 2*(a+b);
    int alan = a*b;
    System.out.println("Dikdörtgenin Çevresi = " +cevre);
    System.out.println("Dikdörtgenin Alanı = " +alan);
}

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1- Toplama İşlemi\n" +
                           "2- Çıkarma İşlemi\n" +
                           "3- Çarpma İşlemi\n" +
                           "4- Bölme işlemi\n" +
                           "5- Üslü Sayı Hesaplama\n" +
                           "6- Faktoriyel Hesaplama\n" +
                           "7- Mod Alma\n" +
                           "8- Dikdörtgen Alan ve Çevre Hesabı\n"+
                           "9- Çıkış"); 
         while(true){  
        System.out.print("Lütfen Bir İşlem Seçiniz : ");
        int secenek = input.nextInt();
             switch(secenek){
                 case 1: 
                     toplama();
                     break;
                 case 2: 
                     cıkarma();
                     break;
                 case 3:
                     carpma();
                     break;
                 case 4:
                     bolme();
                     break;
                 case 5: 
                     us();
                     break;
                 case 6:
                     fak();
                     break;
                 case 7:
                     mod();
                     break;
                 case 8:
                     dik();
                     break;
                 case 9: 
                     break;
                     default:
                         System.out.println("Geçersiz Bir Seçenek Seçtiniz...");
                     
             }
         }
    }
    
}
