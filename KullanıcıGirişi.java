/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class KullanıcıGirişi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String userName , password;
        System.out.print("Lütfen kullanıcı adınızı giriniz:");
        userName = input.nextLine();
        System.out.println("Lütfen şifrenizi giriniz:");
        password = input.nextLine();
        
        if(userName.equals("Patika")){
            if(password.equals("Dev")){
                System.out.println("Sisteme başarılı şekilde giriş yaptınız.");
            }
            else {
                System.out.println("Hatalı giriş yaptınız.");
                System.out.println("");
            }
        }
    }
    
}
