/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] sayi = {1,1,0,1,0,1,1,0,1,0};
         Scanner deger = new Scanner(System.in);
         int toplam = 0;
         int carpim = 1;
         System.out.print("Taban değerini giriniz : ");
         int taban = deger.nextInt();
         if(taban > 10 || taban < 2)
         {
             System.out.println("Program sonlandırıldı.");
             return;
         }
         for (int i = 9; i >= 0; i--) 
         {
            carpim *= taban;
            toplam += sayi[i] * carpim;
         }
         System.out.println("Sonuç : " + toplam/taban);
    }
    
}
