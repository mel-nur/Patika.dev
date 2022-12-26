/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class KDVTutarıHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double kdv , kdvlitutar, kdvtutarı, tutar;
        System.out.print("Lütfen tutar giriniz:");
        tutar = input.nextDouble();
        if (tutar<1000){
           kdv = 1.8;
           
        }
        else {
            kdv = 0.08;
        }
        kdvtutarı = tutar*kdv;
        kdvlitutar = kdvtutarı+tutar;
        System.out.println("KDV"+kdv);
        System.out.println("KDV Tutarı:" +kdvtutarı);
        System.out.println("KDV'li Fiyatı:"+kdvlitutar);
       
        
        
    }
    
}
