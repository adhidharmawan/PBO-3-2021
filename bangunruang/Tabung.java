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
public class Tabung {
    //atribut
    public int jari;
    public int tinggi;
    
    //methods
    public void hitungVol(){
        double hasil = 3.14 * jari * jari * tinggi;
        System.out.println("Hasil Volume Tabung: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * 3.14 * jari *  tinggi;
        System.out.println("Hasil Luas Selimut Tabung: " + hasil);
    }
}
