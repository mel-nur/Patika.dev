/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Çiftve4ünKatıOlanSayılarıToplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp yazdıran program
      Scanner input = new Scanner(System.in);
      int n;
      int toplam = 0;
              
       do{
          System.out.print("Lütfen bir sayı giriniz:");
          n = input.nextInt();
          if(n % 4 == 0){
              toplam+=n;
          }
      }while(n % 2 == 0);
        System.out.println("Toplam = " +toplam);
    }
    
    
}
