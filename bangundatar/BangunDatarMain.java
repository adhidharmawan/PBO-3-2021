/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author User
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 25;
        pp1.lebar = 38;
        pp1.hitungLuas();
        pp1.hitungKeliling();
        
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        Persegi p2 = new Persegi();
        p2.sisi = 15;
        p2.hitungLuas();
        p2.hitungKeliling();
        
        Lingkaran l1 = new Lingkaran();
        l1.jari = 25;
        l1.hitungLuas();
        l1.hitungKeliling();
        
        Lingkaran l2 = new Lingkaran();
        l2.jari = 37;
        l2.hitungLuas();
        l2.hitungKeliling();
        
    }
}
