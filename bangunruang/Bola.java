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
public class Bola {
    //atribut
    public int jari;
    
    //methods
    public void hitungVol(){
        double hasil = (4 * 3.14 * jari * jari * jari)* 1 / 3;
        System.out.println("Hasil Volume Bola: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * 3.14 * jari * jari;
        System.out.println("Hasil Luas Selimut Bola: " + hasil);
    }
    
}
