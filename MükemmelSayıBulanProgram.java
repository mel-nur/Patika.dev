/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MükemmelSayıBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;
        
        for(int i = 1; i<sayi; i++){
            if(sayi % i == 0){
                 toplam += i;
            }
        }
        if(sayi == toplam){
            System.out.println(sayi + " Mükemmel bir sayıdır...");
        }
        else{
            System.out.println(sayi+ " Mükemmel sayı değildir...");
        }
               
    }
    
}
