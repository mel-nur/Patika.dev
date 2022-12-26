/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class FibonacciSerisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Serisi Kaç Elemanlı Olsun : ");
       int n = input.nextInt();
       int s1 = 0;
       int s2 = 1;
       int toplam = 0;
       for(int i = 2; i<=n; i++){
         
           toplam = s1+s2;
           s1 = s2;
           s2 = toplam;
          
       }
        System.out.println(toplam);
        
    }
    
}
