/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas6 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            try {
                
                System.out.print("Masukkan jumlah bilangan: ");
                int n = input.nextInt();
                
                double[] angka = new double[n];
                
                double jumlah = 0;
                
                for (int i = 0; i < n; i++) {
                    
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    
                    angka[i] = input.nextDouble();
                    
                    jumlah += angka[i];
                }
                
                double rataRata = jumlah / n;
                
                System.out.println("\n=== HASIL PERHITUNGAN ===");
                
                System.out.println("Jumlah bilangan: " + jumlah);
                System.out.println("Nilai rata-rata: " + rataRata);
                
            } catch (InputMismatchException e) {
                
                System.out.println("Kesalahan: Input harus berupa angka!");
                
            } catch (NegativeArraySizeException e) {
                
                System.out.println("Kesalahan: Jumlah bilangan tidak boleh negatif!");
                
            } catch (ArithmeticException e) {
                
                System.out.println("Kesalahan: Tidak dapat menghitung rata-rata!");
                
            }

            }
    }}