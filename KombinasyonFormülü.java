/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class KombinasyonFormülü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayıını giriniz: ");
        int n = input.nextInt();
        int k = 1; 
        
        for(int i = 1; i<=n; i++){
            k*=i; //n!
        }
        System.out.print("Kaç elemanlı olacağını giriniz : ");
        int r = input.nextInt();
        int m = 1;
        
        for (int j = 1; j<=r; j++){
            m*=j; //r!
        }
        int b = 1;
        for(int a = 1; a<=(n-r); a++){
            b*=a; // (n-r)!
        }
        double C =  k/(m*b);
        System.out.println("Kombinasyon"+C);
    
        
            
        }
            
        }
                

