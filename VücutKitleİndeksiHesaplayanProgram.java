
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
public class VücutKitleİndeksiHesaplayanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        double kg;
        double boy;
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
        kg = input.nextDouble();
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        double vki = kg / (boy * boy);
        System.out.println("Vücut Kitle Endeksi:" +vki);
    }
    
}
