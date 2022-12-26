/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class HarmonikSayılarıBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        double sayi = input.nextDouble();
        double toplam = 0;
        for(double i = 1; i<=sayi; i++){
            toplam += 1/i;
        }
        System.out.println("Harmonik Sayı" +toplam);
    }
    
}
