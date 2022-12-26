/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class BasamakSayılarınınToplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
      
        while(sayi > 0){
          int basdegeri = sayi % 10;
          toplam += basdegeri; 
          sayi = sayi/10;
           
        }
        System.out.println("Basamak Sayılarının Toplamı =" +toplam);
    }
    
}
