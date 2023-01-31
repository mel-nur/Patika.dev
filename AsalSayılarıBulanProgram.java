/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class AsalSayılarıBulanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i = 1; i<=100; i++){
            int sayac = 0;
            for(int j = 1; j<=100; j++){
                if(i % j == 0){
                    sayac++;                }
            }
            if(sayac == 2){
                System.out.println(i+" asal sayıdır");
            }
           
            
        }
    }
    
}
