/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hitung;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika septia = new Matematika(2,2);
        
        System.out.println("Hasil penjumlahan"+septia.setPenjumlahan());
        System.out.println("Hasil pengurangan"+septia.setPengurangan());
        System.out.println("Hasil perkalian"+septia.setPerkalian());
        System.out.println("Hasil pembagian"+septia.setPembagian());
    }
            
}
