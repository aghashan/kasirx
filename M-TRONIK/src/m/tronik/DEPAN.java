/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class DEPAN {
    public void pilih(){
         System.out.println("******************************************************");
      System.out.println("    MENU  ");
      System.out.println("|1.PULSA  ");
      System.out.println("|2.PAKET DATA  ");
      System.out.println("|3.E-WALLET   ");
      System.out.println("******************************************************");
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan pilihan : ");
      int pilihan = in.nextInt();
      
        switch (pilihan) {
                 case 1:
                     {
                         pulsa ObjekInput=new pulsa();
                            ObjekInput.daftar();
                            
 
                         break;
                     }
                 case 2:
                     {
                         paketdata ObjekInput=new paketdata();
                            ObjekInput.jumlah();
                         break;
                     }
                 case 3:
                     {
                         ewallet ObjekInput=new ewallet();
                            ObjekInput.ewallet();
                         break;
                     }
                 
    }
    }

    void total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
