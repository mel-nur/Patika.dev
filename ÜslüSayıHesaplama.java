/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class ÜslüSayıHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı: ");
        int a = input.nextInt();
        System.out.print("Üs Olacak Sayı:");
        int b = input.nextInt();
        int sonuc = 1;
        for(int i = 1; i<=b; i++){
            sonuc*=a;

        }
        System.out.println(a+ "^" +b+ "=" +sonuc);
    }
    
}
