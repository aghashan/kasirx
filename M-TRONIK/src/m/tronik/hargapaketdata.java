/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class hargapaketdata {

    
     public void harga(){
         
        int pilihan;
        int hargapaketdata=0;
        String pilih;
     
       int a,b,c,d,e;
       a=20000;
       b=35000;
       c=55000;
       d=60000;
       e=85000;
       String paket;
       System.out.println("    DAFTAR PAKET ");
       System.out.println("1. 2GB              Rp."+a);
       System.out.println("2. 4GB              Rp."+b);
       System.out.println("3. 6GB              Rp."+c);
       System.out.println("4. 8GB              Rp."+d);
       System.out.println("5. unlimited        Rp."+e);
       
         Scanner input = new Scanner(System.in);
    System.out.println("pilih paket");
    
      pilihan=input.nextInt();
    switch(pilihan){
        case 1 :
          hargapaketdata=a;
          break;
        case 2 : 
           hargapaketdata=b;
            break;      
        case 3 :
            hargapaketdata=c;
            break;
        case 4 :
            hargapaketdata=d;
             break;
        case 5 :
            hargapaketdata=e;
            break;
        default:
             System.out.println("barang tidak ada");
            
    }
       hargapaketdata= hargapaketdata;
        
         System.out.println("harga : "+hargapaketdata);
         
         
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


