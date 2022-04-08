/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class paketdata {
  public void jumlah(){
     
      System.out.println("******************************************************");
      System.out.println("     MENU PERHITUNGAN  ");
      System.out.println("|1.INDOSAT ");
      System.out.println("|2.TELKOMSEL  ");
      System.out.println("|3.XL/EXIS   ");
      System.out.println("|4.SMARTFREN ");
      System.out.println("|5.TRI ");
      System.out.println("******************************************************");
      
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan pilihan : ");
      int harga = in.nextInt();
      
       hargapaketdata ObjekInput=new hargapaketdata();
        ObjekInput.harga();
     
     
              
      
  
      
}
}

