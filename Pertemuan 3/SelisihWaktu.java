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

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Waktu pertama");
        System.out.print("  Jam   : ");
        int jam1 = input.nextInt();
        System.out.print("  Menit : ");
        int menit1 = input.nextInt();
        System.out.print("  Detik : ");
        int detik1 = input.nextInt();

        System.out.println("Waktu kedua");
        System.out.print("  Jam   : ");
        int jam2 = input.nextInt();
        System.out.print("  Menit : ");
        int menit2 = input.nextInt();
        System.out.print("  Detik : ");
        int detik2 = input.nextInt();

        int detikTotal1 = jam1 * 3600 + menit1 * 60 + detik1;
        int detikTotal2 = jam2 * 3600 + menit2 * 60 + detik2;
        int selisih = Math.abs(detikTotal2 - detikTotal1);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println();
        System.out.printf("Selisih waktu: %d jam, %d menit, %d detik%n", jam, menit, detik);
    }
}
