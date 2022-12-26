
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
public class ÜçgeninAlanı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        int a,b,c;
        double u,alan ;
        System.out.print("Üçgenin 1. kenarı:");
        a = input.nextInt();
        System.out.println("Üçgenin 2. kenarı:");
        b = input.nextInt();
        System.out.println("Üçgenin 3. kenarı:");
        c = input.nextInt();
        
        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:" +alan);
    }
    
}
