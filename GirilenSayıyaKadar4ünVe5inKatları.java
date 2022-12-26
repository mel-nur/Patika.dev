/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class GirilenSayıyaKadar4ünVe5inKatları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sayac1 = 0 , sayac2 = 0;
        System.out.println("4'ün Kuvvetleri:");
        for(int i = 1; i<=sayi; i*=4){
            System.out.println(4+"^"+sayac1+"="+i);
            sayac1++;
        }
        System.out.println("5'in Kuvvetleri:");
        for(int j = 1; j<=sayi; j*=5){
            System.out.println(5+"^"+sayac2+"="+j);
            sayac2++;
        }
    }
    
}
