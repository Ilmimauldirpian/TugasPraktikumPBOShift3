/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;
class SumpahPemuda {
    // Kalimat pembuka dibuat di dalam konstruktor
    SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    // Kalimat lanjutan tiga sumpah ditampilkan lewat method
    void tampilkanTigaSumpah() {
        System.out.println("1. Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("2. Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("3. Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class Soal4 {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.tampilkanTigaSumpah();
    }
}