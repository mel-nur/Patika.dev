/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class SınıfıGeçmeDurumuHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double mat , turkce , fizik , kimya , muzik , ort;
        int derssayisi = 5;
        System.out.print("Lütfen Matematik notunuzu giriniz:");
        mat = input.nextDouble();
        System.out.print("Lütfen Türkçe notunuzu giriniz:");
        turkce = input.nextDouble();
        System.out.print("Lütfen Fizik notunuzu giriniz:");
        fizik = input.nextDouble();
        System.out.print("Lütfen Kimya notunuzu giriniz:");
        kimya = input.nextDouble();
        System.out.print("Lütfen Müzik notunuzu giriniz:");
        muzik = input.nextDouble();
        
        if (mat<0 || mat>100){
            mat = 0;
            derssayisi--;
        }
        if (turkce<0 || turkce>100){
            turkce = 0;
            derssayisi--;
        }
         if (fizik<0 || fizik>100){
            fizik = 0;
            derssayisi--;
        }
        if (kimya<0 || kimya>100){
            kimya = 0;
            derssayisi--;
        }
         if (muzik<0 || muzik>100){
                   muzik = 0;
                   derssayisi--;
                }
           
        ort = (mat+turkce+kimya+fizik+muzik)/derssayisi;
       if (ort >= 55 && ort <= 100) {
            System.out.print("Geçtiniz :) Ortalamanız = " + ort);
        } 
       else if (ort < 55 && ort >= 0) {
            System.out.print("Kaldınız :( Ortalamanız = " + ort);
        }
        
        
    }
    
}
