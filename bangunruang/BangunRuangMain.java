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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola b1 = new Bola();
        b1.jari = 10;
        b1.hitungVol();
        b1.hitungLuasSelimut();
        
        Kerucut k1 = new Kerucut();
        k1.jari = 5;
        k1.tinggi = 20;
        k1.s = 13;
        k1.hitungVol();
        k1.hitungLuasSelimut();
        
        Tabung t1 = new Tabung();
        t1.jari = 10;
        t1.tinggi = 36;
        t1.hitungVol();
        t1.hitungLuasSelimut();
    }
}
