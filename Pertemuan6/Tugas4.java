/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        input.nextLine();

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = input.nextInt();

            input.nextLine();

            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        System.out.println("\n========== DAFTAR NILAI MAHASISWA ==========");
        System.out.printf("%-5s %-20s %-10s %-15s%n",
                "No", "Nama", "Nilai", "Status");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10d %-15s%n",
                    (i + 1), nama[i], nilai[i], status[i]);
        }

        input.close();
    }
}