/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ArtıkYılHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int yil, kalanYuz, kalanDort, kalanDortYuz;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        kalanYuz = yil % 100;
        kalanDort = yil % 4;

        if (kalanDort == 0) {
            if (kalanYuz == 0) {
                kalanDortYuz = yil % 400;
                if (kalanDortYuz == 0) {
                    System.out.print(yil + " bir artık yıldır !");
                } else {
                    System.out.print(yil + " bir artık yıl değildir !");
                }
            } else {
                System.out.print(yil + " bir artık yıldır !");
            }
        } else {
            System.out.print(yil + " bir artık yıl değildir !");
        }
    }
    
}
