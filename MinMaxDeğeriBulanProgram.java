/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MinMaxDeğeriBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int n = input.nextInt();
        int max = 0 , min = 0;
        
        for ( int i = 1; i<=n; i++){
            System.out.print(i+ ". Sayı : ");
            int sayi = input.nextInt();
            
            if(sayi>=max){
                if(min == 0){
                    min=sayi;
                }
               
                   max=sayi;
                
            }
            if(sayi<min){
                if(max == 0){
                    max=sayi;
                }
                
                    min=sayi;
                
               
                }
            
                }
        System.out.println("Maximum Değer : " +max);
        System.out.println("Minimum Değer : " +min);
       
            }
            
    
}
