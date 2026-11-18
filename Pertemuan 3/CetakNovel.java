/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final long DETIK_PER_MENIT = 60;
        final long DETIK_PER_JAM = 3600;
        final long DETIK_PER_HARI = 86400;

        System.out.print("Banyaknya novel yang dicetak : ");
        long jumlahNovel = input.nextLong();
        System.out.print("Tebal tiap novel (lembar)    : ");
        long lembarPerNovel = input.nextLong();

        // Kecepatan mesin 1 lembar/detik -> total detik = total lembar
        long totalDetik = jumlahNovel * lembarPerNovel;

        long hari = totalDetik / DETIK_PER_HARI;
        long sisa = totalDetik % DETIK_PER_HARI;
        long jam = sisa / DETIK_PER_JAM;
        sisa = sisa % DETIK_PER_JAM;
        long menit = sisa / DETIK_PER_MENIT;
        long detik = sisa % DETIK_PER_MENIT;

        System.out.println();
        System.out.println("Total lembar : " + totalDetik);
        System.out.printf("Waktu cetak  : %d hari, %d jam, %d menit, %d detik%n", hari, jam, menit, detik);
    }
}
