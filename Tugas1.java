/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;

        System.out.println("Masukkan sebanyak 10 bilangan:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();

            if (bilangan > terbesar) {
                terbesar = bilangan;
            }
            if (bilangan < terkecil) {
                terkecil = bilangan;
            }
        }

        System.out.println("\nBilangan terbesar adalah: " + terbesar);
        System.out.println("Bilangan terkecil adalah: " + terkecil);
        scanner.close();
    }
}