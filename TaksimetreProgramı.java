/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class TaksimetreProgramı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilen mesafeyi km cinsinden giriniz:");
        int km = input.nextInt();
        double tutar = 10+(km*2.20);
        if (tutar<20){
            System.out.println("Toplam Tutar:"+20);
        }
        else {
            System.out.println("Toplam Tutar:" +tutar);
        }
    }
    
}
