/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1 , n2 , select;
        System.out.print("Lütfen 1. sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz:");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = input.nextInt();
        
        switch (select){
            case 1:
                System.out.println("Toplama:" +(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma:" + (n1-n2));
                break;
            case 3: 
                System.out.println("Çarpma:" +(n1*n2));
                break;
            case 4 :
            if (n2!=0){
                System.out.println("Bölme:" +(n1/n2));
            }
            else{
                System.out.println("Bir sayı sıfıra bölünemez");
            }
            break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
            
            
        }
                
                
    }
    
}
