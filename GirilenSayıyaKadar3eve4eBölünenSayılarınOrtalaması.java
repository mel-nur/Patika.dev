
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class GirilenSayıyaKadar3eve4eBölünenSayılarınOrtalaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 0 dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int n = input.nextInt();
        int sayac = 0;
        double sonuc;
        int k = 0;
       
        for(int i = 0; i<=n; i++){
            if(i % 3 == 0 && i % 4 == 0){
                k+=i;
                sayac++;
                System.out.println(i);
            }
            
        }
        sonuc = k/sayac;
        System.out.println("Sonuç=" +sonuc);
    }
    
}
