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
public class Persegi {
    //atribut
    public int sisi;
    
    //methods
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Hasil Luas Persegi: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = 4 * sisi;
        System.out.println("Hasil Keliling Persegi: " + hasil);
    }
}
