
package tugaspertemuan3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * PERBEDAAN CLASS Scanner DAN CLASS BufferedReader
 *
 * Scanner pake java.util
 *  - Bisa langsung mem-parsing tipe data: nextInt(), nextDouble(), nextLine(), dst.
 *  - Mudah dipakai, cocok untuk program sederhana / pemula.
 *  - Lebih lambat karena memakai regex dan buffer kecil (1 KB).
 *  - Tidak melempar IOException (exception ditelan, cek lewat hasNext...).
 *  - Tidak thread-safe.
 * Sedangkan
 * BufferedReader pkejava.io
 *  - Hanya membaca String (readLine()); angka harus dikonversi manual
 *    dengan Integer.parseInt(), Double.parseDouble(), dst.
 *  - Lebih cepat karena buffer lebih besar (8 KB), cocok untuk data besar.
 *  - Wajib menangani IOException (try-catch atau throws).
 *  - Thread-safe (synchronized).
 */
public class ScannerdanbufferedReader {

    // Contoh memakai Scanner: nextInt() langsung menghasilkan int
    static void contohScanner(BufferedReader sumber) {
        Scanner sc = new Scanner(sumber);
        System.out.println("=== Contoh Scanner ===");
        System.out.print("Masukkan nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan umur  : ");
        int umur = sc.nextInt();   // langsung jadi int, tanpa konversi manual
        System.out.println("Halo " + nama + ", umur " + umur + " tahun");
    }

    // Contoh memakai BufferedReader: readLine() selalu String, perlu parseInt
    static void contohBufferedReader(BufferedReader br) throws IOException {
        System.out.println("=== Contoh BufferedReader ===");
        System.out.print("Masukkan nama  : ");
        String nama = br.readLine();
        System.out.print("Masukkan umur  : ");
        int umur = Integer.parseInt(br.readLine()); // konversi manual
        System.out.println("Halo " + nama + ", umur " + umur + " tahun");
    }

    public static void main(String[] args) throws IOException {
        // Satu pembaca untuk System.in supaya tidak saling berebut input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pilih contoh program:");
        System.out.println("1. Scanner");
        System.out.println("2. BufferedReader");
        System.out.print("Pilihan : ");
        String pilihan = br.readLine().trim();
        System.out.println();

        if (pilihan.equals("1")) {
            contohScanner(br);
        } else if (pilihan.equals("2")) {
            contohBufferedReader(br);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}