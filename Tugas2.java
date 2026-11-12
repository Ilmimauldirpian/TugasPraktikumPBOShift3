/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang ingin dimasukkan: ");
        int jumlahBilangan = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= jumlahBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double angka = scanner.nextDouble();
            total += angka;
        }

        double rataRata = (jumlahBilangan > 0) ? (total / jumlahBilangan) : 0;

        System.out.println("\nTotal jumlah bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rataRata);
        scanner.close();
    }
}