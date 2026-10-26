/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;



public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan Nama: ");
        input.nextLine(); // membersihkan buffer
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();

        long gajiPokok = 0;
        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;
        int jumlahAnak = 0;

        // Menentukan gaji pokok dan aturan tunjangan berdasarkan kode golongan
        switch (kodeGolongan) {
            case 1: 
                gajiPokok = 1200000; 
                // Golongan 1: Menikah (mendapatkan tunjangan pasangan)
                tunjanganPasangan = 0.10 * gajiPokok;
                break;
            case 2: 
                gajiPokok = 1500000; 
                // Golongan 2: Belum menikah (tidak dapat tunjangan)
                break;
            case 3: 
                gajiPokok = 1750000; 
                // Golongan 3: Cerai (tidak dapat tunjangan)
                break;
            case 4: 
                gajiPokok = 2000000; 
                // Golongan 4: Menikah dan punya anak (dapat tunjangan pasangan dan anak)
                tunjanganPasangan = 0.10 * gajiPokok;
                System.out.print("Masukkan Jumlah Anak: ");
                jumlahAnak = input.nextInt();
                tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
                break;
            default: 
                System.out.println("Kode golongan tidak valid!");
        }

        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n--- Rincian Gaji Karyawan ---");
        System.out.println("NIK            : " + nik);
        System.out.println("Nama           : " + nama);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("Tunjangan      : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih    : Rp " + gajiBersih);
    }
}