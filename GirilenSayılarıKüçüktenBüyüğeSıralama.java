/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class GirilenSayılarıKüçüktenBüyüğeSıralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı:");
        int s1 = input.nextInt();
        System.out.print("2. Sayı:");
        int s2 = input.nextInt();
        System.out.print("3. Sayı:");
        int s3 = input.nextInt();
        
        if (s1<s2 && s1<s3){
            if (s2<s3){
                System.out.println("s1<s2<s3");
            }
            else {
                System.out.println("s1<s3<s2");
            }
        }
        else if (s2<s1 && s2<s3){
            if (s1<s3){
                System.out.println("s2<s1<s3");
            }
            else {
                System.out.println("s2<s3<s1");
            }
        }
        else {
            if (s1<s2){
                System.out.println("s3<s1<s2");
            }
            else {
                System.out.println("s3<s2<s1");
            }
        }
    }
    
}
