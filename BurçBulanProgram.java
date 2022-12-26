/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class BurçBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("1-Ocak\n2-Şubat\n3-Mart\n4-Nisan\n5-Mayıs\n6-Haziran\n7-Temmuz\n8-Ağustos\n9-Eylül\n10-Ekim\n11-Kasım\n12-Aralık");
        System.out.print("Lütfen Doğduğunuz Ayı Seçiniz:");
         int ay = input.nextInt();
        System.out.print("Doğduğunuz Gün:");
        int gun = input.nextInt();
        
        if(ay==1){
            if (gun<=21 && gun>=1){
                System.out.println("Oğlak Burcusunuz");
            }
            else if (gun>=22 && gun<=31){
                System.out.println("Kova Burcusunuz");  
            }
            
        }
        else if (ay==2){
            if (gun<=19 && gun>=1){
                System.out.println("Koca Burcusunuz");
            }
            else if(gun>=20 && gun<=29){
                System.out.println("Balık Burcusunuz");
            }
            
        }
        else if(ay==3){
            if(gun<=20 && gun>=1){
                System.out.println("Balık Burcusunuz");
            }
            else if (gun>=21 && gun<=31){
                System.out.println("Koç Burcusunuz");
            }
            
            }
        else if(ay==4){
            if (gun>=21 && gun<=30){
                System.out.println("Boğa Burcusunuz");
            }
            else if (gun<=20 && gun>=1){
                System.out.println("Koç Burcunuz");
            }
            
        }
        else if(ay==5){
            if (gun>=1 && gun<=21){
                System.out.println("Boğa Burcusunuz"); 
            }
            else if(gun<=31 && gun>=22){
                System.out.println("İkizler Burcusunuz");
            }
        }
         else if(ay==6){
            if (gun>=1 && gun<=22){
                System.out.println("İkizler Burcusunuz");
            }
            else if(gun<=30 && gun>=23){
                System.out.println("Yengeç Burcusunuz");
            }
        }
         else if(ay==7){
             if (gun>=1 && gun<=22){
                 System.out.println("Yengeç Burcusunuz");  
             }
             else if (gun<=31 && gun>=23){
                 System.out.println("Aslan Burcusunuz");
             }
        }
         else if(ay==8){
             if (gun>=1 && gun<=22){
                 System.out.println("Aslan Burcusunuz");
             }
             else if (gun<=30 && gun>=23){
                 System.out.println("Başak Burcusunuz");
             }
        }
         else if(ay==9){
             if (gun>=1 && gun<=22){
                 System.out.println("Başak Burcusunuz");
             }
             else if (gun<=31 && gun>=23){
                 System.out.println("Terazi Burcusunuz");
             }
        }
         else if(ay==10){
             if (gun>=1 && gun<=22){
                 System.out.println("Terazi Burcusunuz");
             }
             else if (gun<=30 && gun>=23){
                 System.out.println("Akrep Burcuusnuz");
             }
        }
        else if(ay==11){
            if (gun>=1 && gun<=21 ){
                System.out.println("Akrep Burcusunuz");
            }
            else if(gun<=31 && gun>=22){
                System.out.println("Yay Burcusunuz");
            }
        }
        else if(ay==12){
            if (gun>=1 && gun>=21){
                System.out.println("Yay Burucusunuz");
            }
            else if(gun<=30 && gun>=22){
                System.out.println("Oğlak Burcusunuz");
            }
        }
        
        
       
        
                
            }
        }        
        
       
            
    
    

