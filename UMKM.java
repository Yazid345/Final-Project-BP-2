/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fpbp2_1;
import java.util.Scanner;
public class UMKM {
    public static void main(String[] args) {
        cMenu m = new cMenu("Nasi Soto",20000);
        cPelanggan p = new cPelanggan("Monkey D Luffy", "Zou");
        cTransaksi tr = new cTransaksi(m, p, 2);
        Scanner sc = new Scanner(System.in);
        int pilih=0;
        do{
            System.out.println("\nMENU");
            System.out.println("1. Menu");
            System.out.println("2. Pelanggan");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
            }
        }while(pilih!=4);
    }
}
