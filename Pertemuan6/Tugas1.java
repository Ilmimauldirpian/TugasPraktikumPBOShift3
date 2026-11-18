/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */
public class Tugas1 {
    public static void main(String[] args) {

        // Variasi 1: Deklarasi lalu isi
        int[] angka1 = new int[4];
        angka1[0] = 10;
        angka1[1] = 20;
        angka1[2] = 30;
        angka1[3] = 40;

        // Variasi 2: Langsung mengisi array
        int[] angka2 = {50, 60, 70, 80};

        // Variasi 3: Menggunakan new int[]
        int[] angka3 = new int[]{90, 100, 110, 120};

        System.out.println("Array Variasi 1:");
        for (int i = 0; i < angka1.length; i++) {
            System.out.println(angka1[i]);
        }

        System.out.println("\nArray Variasi 2:");
        for (int i = 0; i < angka2.length; i++) {
            System.out.println(angka2[i]);
        }

        System.out.println("\nArray Variasi 3:");
        for (int i = 0; i < angka3.length; i++) {
            System.out.println(angka3[i]);
        }
    }
}
