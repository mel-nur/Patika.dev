
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class OrtalamaHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int matematik , fizik , kimya , turkce , muzik , tarih ;
        System.out.println("Lütfen matematik sınavındaki notunuzu giriniz:");
        matematik = input.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("LÜtfen kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Lütfen türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.println("Lütfen müziik notunuzu giriniz:");
        muzik = input.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz:");
        tarih = input.nextInt();
        
        int toplam = tarih+matematik+fizik+kimya+turkce+muzik;
        double ortalama = toplam / 6;
        System.out.println("Not ortalamanız:" +ortalama);
        
        while (ortalama >= 60){
            System.out.println("Sınıfı geçtiniz");
            break;
        }
        while (ortalama <60){
            System.out.println("Sınıfta kaldınız");
            break;
        }
    }
    
}
