/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119047.aldyputrahanggara.no2;

import data.Tabungan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO IF-2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM PENARIKAN UANG TABUNGAN
*/

public class UTSIF210119047ALDYPUTRAHANGGARANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ambilUang;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Program Penarikan Uang====");
        
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        ambilUang = tabungan.ambilUang(input.nextInt());
        
        System.out.println("Saldo Anda Sekarang : " + ambilUang);
        
    }
}
    

