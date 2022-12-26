
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
public class ATMprojesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        String userName , password;
        int hak = 3;
        int bakiye = 1500;
        int secenek;
        int miktar;
        
        while(hak>0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if(password.equals("dev123") && userName.equals("patika")){
                System.out.println("Merhaba Çotak Bankasına Hoşgeldiniz");
                do{
                    System.out.println("1-) Para Yatırma");
                    System.out.println("2-) Para Çekme");
                    System.out.println("3-) Bakiye Sorgulama");
                    System.out.println("4-) Çıkış Yapma");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    secenek = input.nextInt();
                    
                   switch(secenek){
                       case 1 :
                           System.out.println("Yatırmak İstediğiniz Para Miktarı");
                            miktar = input.nextInt();
                           bakiye += miktar ;    
                           
                       case 2 : 
                           System.out.println("Çekmek İstediğiniz Para Miktarı:");
                            miktar = input.nextInt();
                           if(miktar > bakiye){
                               System.out.println("Yetersiz Bakiye");
                           }
                           else {
                               bakiye -= miktar;
                           }
                           
                       case 3 :
                           System.out.println("Güncel Bakiyeniz : " +bakiye);
                                   }
                
                }while(secenek != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
                
            }
            else{
                hak--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre girdiniz. Lütfen tekrar deneyiniz");
                if(hak == 0){
                    System.out.println("Hesabınız Bloke Olmuştur...");
                }
                else{
                    System.out.println("Kalan hakkınız : " +hak);
                }
            }
        }
    }
    }
    

