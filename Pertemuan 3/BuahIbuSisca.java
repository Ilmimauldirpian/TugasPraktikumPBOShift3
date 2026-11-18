/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuahIbuSisca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah buah mangga yang dibeli (pcs)     : ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah tetangga                          : ");
        int tetangga = Integer.parseInt(br.readLine());
        System.out.print("Jambu untuk tiap tetangga (pcs)          : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        System.out.print("Mangga busuk yang dikembalikan (pcs)     : ");
        int busuk = Integer.parseInt(br.readLine());

        int manggaBersih = mangga - busuk;
        int totalJambu = tetangga * jambuPerTetangga;
        int totalBuah = manggaBersih + totalJambu;

        System.out.println();
        System.out.println("Mangga setelah dikurangi yang busuk : " + manggaBersih + " pcs");
        System.out.println("Total jambu                         : " + totalJambu + " pcs");
        System.out.println("Total buah yang dibeli              : " + totalBuah + " pcs");
    }
}