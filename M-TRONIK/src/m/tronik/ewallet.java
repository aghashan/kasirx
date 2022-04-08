/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.tronik;

import java.util.Scanner;
public class ewallet {
  //  ewallet ewallet=new ewallet();
    public void ewallet(){
      System.out.println("******************************************************");
      System.out.println("     PILIH E-WALLET  ");
      System.out.println("|1.DANA ");
      System.out.println("|2.OVO  ");
      System.out.println("|3.SHOPEEPAY  ");
      System.out.println("|4.GOPAY ");
      System.out.println("******************************************************");
      
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan pilihan : ");
      int harga = in.nextInt();
      
      hargaewallet ObjekInput=new hargaewallet();
        ObjekInput.harga();
     
     
}
     
      
    
}
  
     

