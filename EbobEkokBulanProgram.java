/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class EbobEkokBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int s1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int s2 = input.nextInt();
        int i = 1 , ebob = 1 , j = 1 , ekok = 1;
        int min = (s1 < s2)? s1:s2;
        
        while(i<=min){
            if((s1 % i == 0) && (s2 % i == 0)){
                ebob = i;
            }
            i++;
        }
        while(j<=(s1*s2)){
            if((j % s1 == 0) && (j % s2 == 0)){
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println(s1 + " ve " +s2+ " Sayılarının EBOB'u :" +ebob);
        System.out.println(s1 + " ve " +s2+ " Sayılarının EKOK'u :" +ekok);
    }
    
}
