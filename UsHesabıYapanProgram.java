
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class UsHesabıYapanProgram {
   
    static int us(int taban, int us) {

        if (us != 0) {
            return taban*us(taban, us-1);
        } else {
            return 1;
        }
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextByte();

        System.out.print("Üs değeri giriniz: ");
        int  us = input.nextByte();

        System.out.println("Sonuç: " + us(taban, us));
    }
    
}
