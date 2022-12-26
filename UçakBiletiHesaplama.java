/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class UçakBiletiHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int age , tip;
        double yasindirimi = 0;
        double biletfiyati;
        double indirimlitutar;
        System.out.print("Lütfen gideceğiniz mesafeyi giriniz:");
        double mesafe = input.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz:");
        age = input.nextInt();
        System.out.println("Lütfen Yolculuk Tipiniz Seçiniz:");
        System.out.println("1-Gidiş\n2-Gidiş-Dönüş");
        tip = input.nextInt();
        if (mesafe>=0){
           double normaltutar = mesafe*0.10;  
           if(age<12 && age>=1){
            yasindirimi = normaltutar*0.2;
           
        }
           else if(age>=12 && age<=24){
               yasindirimi = normaltutar*0.1;
           }
           else if(age>=65){
               yasindirimi = normaltutar*0.3;
                   
               }
          
             indirimlitutar = normaltutar-yasindirimi;
               
           if(tip==2){
              double tip2indirimi = indirimlitutar*0.20;
              biletfiyati =(indirimlitutar-tip2indirimi);
               System.out.println("Bilet fıyatı=" +2*biletfiyati);
           }
           else{
               biletfiyati = normaltutar-yasindirimi;
               System.out.println("Bilet Fiyatı" +biletfiyati);
         
           }
           }
        else{
            System.out.println("Hatalı veri girdiniz");
        }
           
           
           
               
        }
        
        
    
        
    }
        
        
    
    

