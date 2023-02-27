/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PalindromSayılar {

    static boolean isPalindrom(int number){
        int temp = number , reverseNumber = 0 , lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.err.println(isPalindrom(121));
    }
    
}
