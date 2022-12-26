
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
public class DaireDilimininAlanınıBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        int r; 
        int a;
        double pi = 3.14;
        System.out.println("Lütfen dairenin yarıçapını giriniz:");
        r = input.nextInt();
        System.out.println("Lütfen dairenin açısını giriniz:");
        a = input.nextInt();
        double dil_alani = (pi * (r*r) * a)/360;
        System.out.println("Daire diliminin alanı:" +dil_alani);
    }
    
}
