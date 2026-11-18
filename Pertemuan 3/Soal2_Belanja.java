/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;

import java.io.*;
import java.util.Scanner;

public class Soal2_Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String file = "belanja.dat";

        System.out.print("Nama           : ");
        String nama = input.nextLine();
        System.out.print("Total Belanja  : ");
        double totalBelanja = input.nextDouble();
        System.out.print("Diskon (%)     : ");
        double diskon = input.nextDouble();

        double total = totalBelanja - (totalBelanja * diskon / 100);
        System.out.println("Total          : " + total);

        System.out.print("Bayar          : ");
        double bayar = input.nextDouble();
        double kembalian = bayar - total;

        // Menulis data ke file dengan DataOutputStream
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            out.writeUTF(nama);
            out.writeDouble(totalBelanja);
            out.writeDouble(diskon);
            out.writeDouble(total);
            out.writeDouble(bayar);
            out.writeDouble(kembalian);
        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
            return;
        }

        // Membaca kembali data dengan DataInputStream
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            System.out.println();
            System.out.println("===== STRUK PEMBELANJAAN =====");
            System.out.println("Nama : " + in.readUTF());
            System.out.println("Total Belanja : " + in.readDouble());
            System.out.println("Diskon (%) : " + in.readDouble());
            System.out.println("Total : " + in.readDouble());
            System.out.println("Bayar : " + in.readDouble());
            System.out.println("Kembalian : " + in.readDouble());
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}
