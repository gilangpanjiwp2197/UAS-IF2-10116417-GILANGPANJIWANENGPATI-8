/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10116417.gilangpanjiwanengpati.pkg8;

/**
 *
 *Nama  : Gilang Panji Waneng Pati
 * NIM   : 10116417
 * Kelas : IF-2
 * Tanggal : 27-2-2021
 * No.soal : 8
 */
class PersegiPanjang {
     private int luas;
    private final int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void hitungLuas()
    {
        luas = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang : " + luas);
    }    
    
}
