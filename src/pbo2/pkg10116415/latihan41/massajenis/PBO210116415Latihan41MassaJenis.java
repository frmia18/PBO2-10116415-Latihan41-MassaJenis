/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 * Deskripsi Program : program ini berisi program yang dapat menghitung massa 
 * jenis kubus
 */
public class PBO210116415Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Kubus kubus = new Kubus();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner (System.in);
        
        System.out.println("===Massa Jenis Kubus===");
        System.out.print("Sisi : ");
        kubus.setSisi(scn1.nextInt());
        System.out.print("Massa : " + "\n");
        kubus.setMassa(scn2.nextInt());
        
        System.out.println("");
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Volume : " + kubus.hitungVolume(5));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(5,250));   
    }
}
