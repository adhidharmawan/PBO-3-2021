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
public class Lingkaran {
    //atribut
    public int jari;
    
    //methods
    public void hitungLuas(){
        double hasil = 3.14 * jari * jari;
        System.out.println("Hasil Luas Lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * 3.14 * jari;
        System.out.println("Hasil Keliling Lingkaran: " + hasil);
    }
}
