/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO IF-2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM PENARIKAN UANG TABUNGAN
*/

public class Tabungan {
    
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public Tabungan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int ambilUang(int jumlah){
        return saldo - jumlah;
    }
}
