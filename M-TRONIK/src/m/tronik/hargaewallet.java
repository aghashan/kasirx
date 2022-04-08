/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class hargaewallet {
      public void harga(){
          
       int a,b,c,d;
       int pilihan;
       int harga=0;
        String pilih;
      
       a=22000;
       b=32000;
       c=52000;
       d=102000;
      
       System.out.println("    DAFTAR PAKET ");
       System.out.println("1.20k  harga  :      Rp."+a+"k");
       System.out.println("2.30k  harga  :      Rp."+b+"k");
       System.out.println("3.50k  harga  :      Rp."+c+"k");
       System.out.println("4.100k harga  :      Rp."+d+"k");
       
         Scanner input = new Scanner(System.in);
    System.out.println("pilih paket");
        
      pilihan=input.nextInt();
    switch(pilihan){
        case 1 :
           harga=a;
           break;
           
        case 2 :
            harga=b;
              break;
        case 3 :
            harga=c;
              break;
        case 4:
            harga=d;
              break;
        default:
         System.out.println("barang tidak ada");
    }
    
         harga=harga;
        
         System.out.println("harga : "+harga);
         
            System.out.println("APAKAH ADA TAMBAHAN ?");
      System.out.println("1.YA 2.TIDAK");
      pilihan=input.nextInt();
     
    switch(pilihan){
        case 1 :
            pilih="YA";
            DEPAN ObjekInput=new DEPAN();
             ObjekInput.pilih();
        case 2 : 
            pilih="TIDAK";
              System.exit(0);
    
 
  }
      }
}

