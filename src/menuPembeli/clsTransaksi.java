/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuPembeli;

import KONEKSI.koneksi;
import javax.swing.JOptionPane;

/**
 *
 * @author arifs
 */
public class clsTransaksi extends koneksi {
    String id_transaksi;
    String kode_barang;
    String NamaBarang;
    int harga;
    int jumlah;
    int total_harga;
    
    String Tanggal_transaksi;
    public void tampildata(){
        sql = "select * from tb_keranjang";
    }
    public void simpan(){
        try{
            sql = "insert into tb_keranjang values ('"+id_transaksi+"','"+kode_barang+"','"+NamaBarang+"','"+harga+"','"+jumlah+"','"+total_harga+"')";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
   
}
