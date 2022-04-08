/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class  hargapulsa {
  public void harga(){
    
      int hargapulsa=0;
       int pilihan;
       String pilih;
      
       int a,b,c,d,e,f,g;
       a=6000;
       b=11000;
       c=21000;
       d=31000;
       e=41000;
       f=51000;
       g=101000;      
        
       String paket;
       System.out.println("    DAFTAR PAKET ");
       System.out.println("1.5k harga   :           Rp."+a);
       System.out.println("2.10k harga  :           Rp."+b);
       System.out.println("3.20k harga  :           Rp."+c);
       System.out.println("4.30k harga  :           Rp."+d);
       System.out.println("5.40k harga  :           Rp."+e);
       System.out.println("6.50k harga  :           Rp."+f);
       System.out.println("7.100k harga :           Rp."+g);
      
       
         Scanner input = new Scanner(System.in);
    System.out.println("pilih paket");
     
    //paket=input.nextLine(); 
     
     
     pilihan=input.nextInt();
    switch(pilihan){
        case 1 :
           hargapulsa=a;
           break;
        case 2 : 
            hargapulsa=b;
              break;
        case 3 :
            hargapulsa=c;
              break;
        case 4 :
            hargapulsa=d;
              break;
        case 5 :
            hargapulsa=e;
              break;
        case 6 :
            hargapulsa=f;
              break;
        case 7 :
            hargapulsa=g;
              break;
        default :
             System.out.println("barang tidak ada");
            
    } 

     
      hargapulsa= hargapulsa;
        
         System.out.println("harga : "+hargapulsa);
         
         
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


