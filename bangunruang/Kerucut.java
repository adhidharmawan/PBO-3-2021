/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author User
 */
public class Kerucut {
    //atribut
    public int jari;
    public int tinggi;
    public int s;//garis pelukis
    
    //methods
    public void hitungVol(){
        double hasil = (3.14 * jari * jari * tinggi)/3 ;
        System.out.println("Hasil Volume Kerucut: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * jari * s ;
        System.out.println("Hasil Luas Selimut Kerucut: " + hasil);
    }
}
