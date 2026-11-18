/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */
public class Tugas2 {
    public static void main(String[] args) {

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        // Mengubah nilai Suzuki pada indeks 1
        mobil[1] = "Toyota";

        System.out.println("Nilai array setelah diubah:");

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + " = " + mobil[i]);
        }

        System.out.println("\nNilai indeks yang diubah: " + mobil[1]);
    }
}