/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class HavaSıcaklığınaGöreEtkinlikÖnerenProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz:");
        double sicaklik = input.nextDouble();
        if (sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
        else if (sicaklik>=5 && sicaklik<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (sicaklik>=15 && sicaklik<25){
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }
        else if (sicaklik>=25){
        System.out.println("Yüzmeye gidebilirsiniz");
    }
        
    }
    
}
