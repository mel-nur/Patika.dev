/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ManavKasaProgramı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.0;
        System.out.print("Kaç kg armut aldınız:");
        double armutkg = input.nextDouble();
        System.out.print("Kaç kg elma aldınız:");
        double elmakg = input.nextDouble();
        System.out.print("Kaç kg domates aldınız:");
        double domateskg = input.nextDouble();
        System.out.print("Kaç kg muz aldınız:");
        double muzkg = input.nextDouble();
        System.out.print("Kaç kg patlıcan aldınız:");
        double patlicankg = input.nextDouble();
        
        double toplamtutar = (armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg) ;
        System.out.print("Toplam Tutar:" +toplamtutar);
        
    }
    
}
