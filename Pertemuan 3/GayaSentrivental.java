/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;


import java.util.Scanner;

public class GayaSentrivental  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Massa benda (kg)          : ");
        double m = input.nextDouble();
        System.out.print("Kecepatan (m/s)           : ");
        double v = input.nextDouble();
        System.out.print("Jari-jari lintasan (m)    : ");
        double r = input.nextDouble();

        if (r == 0) {
            System.out.println("Jari-jari tidak boleh 0.");
            return;
        }

        // Fc = (m x v^2) / r
        double fc = (m * v * v) / r;
        System.out.printf("Gaya sentripetal (Fc)     : %.2f N%n", fc);
    }
}