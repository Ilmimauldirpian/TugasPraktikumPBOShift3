/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;
public class Tugas7 {
    public static void main(String[] args) {
        System.out.println("--- Menggunakan i++ (Post-increment) ---");
        int i = 0;
        while (i < 3) {
            System.out.println("Nilai i: " + i++);
            // i dicetak dulu, baru kemudian nilai i bertambah
        }

        System.out.println("\n--- Menggunakan ++i (Pre-increment) ---");
        int j = 0;
        while (j < 3) {
            System.out.println("Nilai j: " + ++j);
            // Nilai j ditambahkan dulu, baru kemudian dicetak
        }
    }
}