/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KASIR1FILE;

import java.util.Scanner;
public class kasir2 {

    public static void main(String[] args) {
         for (String i = "Y"; i.equals("Y")||i.equals("y"); ){
     Scanner F = new Scanner(System.in);
     Scanner in = new Scanner(System.in);
    int pilih;
    int total=0;
    while(true){
    System.out.println("\n ============================");    
    System.out.println(" | SELAMAT DATANG DI I_CALL |");
    System.out.println(" | ======================== |");
    System.out.println(" | 1.PULSA                  |");
    System.out.println(" | 2.PAKET DATA             |");
    System.out.println(" | 3.E-WALLET               |");
    System.out.println(" | 4.SELSEAI                |");
    System.out.println(" ============================"); 
    System.out.print(" MASUKKAN PILIHAN ANDA = ");     
    pilih=F.nextInt();
    if (pilih==1){
        System.out.println("=====DAFTAR PULSA=====");
        System.out.println("1.INDOSAT");
        System.out.println("2.TELKOMSEL");
        System.out.println("3.XL/AXIS");
        System.out.println("4.SMARTFREN");
        System.out.println("5.TRI");
         System.out.println("6.ESIA");
        System.out.print("MASUKKAN PILIHAN ANDA = ");
        pilih=F.nextInt();
        if (pilih==1){
            System.out.println("=====DAFTAR HARGA PULSA INDOSAT=====");
            System.out.println("1.Rp.6.000");
            System.out.println("2.Rp.11.000");
            System.out.println("3.Rp.26.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();           
            if (pilih==1){
                total+=6000;
            }
            else if (pilih==2){
                total+=11000;
            }
            else if (pilih==3){
                total+=26000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
        else if (pilih==2){
            System.out.println("=====DAFTAR HARGA PULSA TELKOMSEL=====");
            System.out.println("1.Rp.21.000");
            System.out.println("2.Rp.51.000");
            System.out.println("3.Rp.100.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();
            if (pilih==1){
                total+=21000;
            }
            else if (pilih==2){
                total+=51000;
            }
            else if (pilih==3){
                total+=100000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
        else if(pilih==3){
            System.out.println("=====DAFTAR HARGA PULSA XL/AXIS=====");
            System.out.println("1.Rp.5.000");
            System.out.println("2.Rp.10.000");
            System.out.println("3.Rp.25.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();
            if (pilih==1){
                total+=5000;
            }
            else if (pilih==2){
                total+=10000;
            }
            else if (pilih==3){
                total+=25000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
        else if(pilih==4){
            System.out.println("=====DAFTAR HARGA PULSA SMARTFREN=====");
            System.out.println("1.Rp.50.000");
            System.out.println("2.Rp.100.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();
            if (pilih==1){
                total+=50000;
            }
            else if (pilih==2){
                total+=100000;
            }            
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
        else if (pilih==5){
            System.out.println("=====DAFTAR HARGA PULSA TRI=====");
            System.out.println("1.Rp.1.000");
            System.out.println("2.Rp.5.000");
            System.out.println("3.Rp.10.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();
            if (pilih==1){
                total+=1000;
            }
            else if (pilih==2){
                total+=5000;
            }
            else if (pilih==3){
                total+=10000;
            }
            else{
                 System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
             else if (pilih==6){
            System.out.println("=====DAFTAR HARGA PULSA ESIA=====");
            System.out.println("1.Rp.20.000");
            System.out.println("2.Rp.50.000");
            System.out.println("3.Rp.101.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih = F.nextInt();
            if (pilih==1){
                total+=20000;
            }
            else if (pilih==2){
                total+=50000;
            }
            else if (pilih==3){
                total+=101000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
          
    }
           
             
    
    
    else if (pilih == 2){
            System.out.println("=====DAFTAR HARGA PAKET DATA=====");
            System.out.println("1.1GB Rp.10.000");
            System.out.println("2.2GB Rp.20.000");
            System.out.println("3.3GB Rp.30.000");
            System.out.println("4.4GB Rp.40.000");
            System.out.println("5.6GB Rp.50.000");
            System.out.println("6.8GB Rp.60.000");
            System.out.println("7.UNLIMITED Rp.70.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih=F.nextInt();
            
            if (pilih==1){
                total+=10000;
            System.out.println("Harga paket data 1GB adalah Rp.10.000"); 
            System.out.println(" ");
            }
            else if (pilih==2){
                total+=20000;
            System.out.println("Harga paket data 2GB adalah Rp.20.000");
            System.out.println(" ");
            }
            else if(pilih==3){
                total+=30000;
            System.out.println("Harga paket data 3GB adalah Rp.30.000");
            System.out.println(" ");
            }
            else if(pilih==4){
                total+=40000;
            System.out.println("Harga paket data 4GB adalah Rp.40.000");
            System.out.println(" ");
            }
            else if(pilih==5){
                total+=50000;
            System.out.println("Harga paket data 6GB adalah Rp.50.000"); 
            System.out.println(" ");
            }
            else if (pilih==6){
                total+=60000;
            System.out.println("Harga paket data 8GB adalah Rp.60.000");
            System.out.println(" ");
            }
            else if (pilih==7){
                total+=70000;
            System.out.println("Harga paket data UNLIMITED adalah Rp.70.000");
            System.out.println(" ");
            }            
            else {
            System.out.println("Maaf pilihan anda tidak tersedia");
            System.out.println(" ");
            }
    }
    else if (pilih==3){
            System.out.println("=====DAFTAR E-WALLET=====");
            System.out.println("1.DANA");
            System.out.println("2.OVO");
            System.out.println("3.SHOPPEPAY");
            System.out.println("4.GOPAY");
            System.out.print("MASUKKAN PILHAN ANDA = ");
            pilih=F.nextInt();            
            
           if (pilih==1){
            System.out.println("=====DANA=====");
            System.out.println("1.Rp.20.000");
            System.out.println("2.Rp.30.000");
            System.out.println("3.Rp.50.000");
            System.out.println("4.Rp.100.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");            
            pilih=F.nextInt();
             if (pilih==1){
                total+=20000;
            }
            else if (pilih==2){
                total+=30000;
            }
            else if (pilih==3){
                total+=50000;
            }
            else if(pilih==4){
                total+=100000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
           else if (pilih==2){
            System.out.println("=====OVO=====");
            System.out.println("1.Rp.20.000");
            System.out.println("2.Rp.30.000");
            System.out.println("3.Rp.50.000");
            System.out.println("4.Rp.100.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");           
            pilih=F.nextInt();
             if (pilih==1){
                total+=20000;
            }
            else if (pilih==2){
                total+=30000;
            }
            else if (pilih==3){
                total+=50000;
            }
            else if(pilih==4){
                total+=100000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
           else if (pilih==3){
            System.out.println("=====SHOPPEPAY=====");
            System.out.println("1.Rp.20.000");
            System.out.println("2.Rp.30.000");
            System.out.println("3.Rp.50.000");
            System.out.println("4.Rp.100.000");
            System.out.print("MASUKKAN NOMINAL = ");
            pilih=F.nextInt();
             if (pilih==1){
                total+=20000;
            }
            else if (pilih==2){
                total+=30000;
            }
            else if (pilih==3){
                total+=50000;
            }
            else if(pilih==4){
                total+=100000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
           else if (pilih==4){
            System.out.println("=====GOPAY=====");
            System.out.println("1.Rp.20.000");
            System.out.println("2.Rp.30.000");
            System.out.println("3.Rp.50.000");
            System.out.println("4.Rp.100.000");
            System.out.print("MASUKKAN PILIHAN ANDA = ");
            pilih=F.nextInt();
             if (pilih==1){
                total+=20000;
            }
            else if (pilih==2){
                total+=30000;
            }
            else if (pilih==3){
                total+=50000;
            }
            else if(pilih==4){
                total+=100000;
            }
            else {
                System.out.println("Maaf pilihan anda tidak tersedia");
            }
        }
           else {
            System.out.println("Maaf pilihan anda tidak tersedia");   
           }
    }
    else if (pilih==4){
        break;
    }
    else {
        System.out.println("Maaf pilihan anda tidak tesedia");
    }
         
    }
        
 
       System.out.println("Total yang harus anda bayar = " + total);   
    }
      
  
               System.out.print("Mau Menghitung Lagi? Y/T: ");
      i = in.next();
         }
    }
        
    }
    
    
    
        


    

