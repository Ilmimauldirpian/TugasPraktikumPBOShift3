/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class GajiBersihKaryawan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gaji bersih karyawan");
        
        System.out.print("Nomor induk karyawan : ");
        String npm = input.nextLine();
        
        System.out.print("Nama karyawan : ");
        String nama = input.nextLine();
        
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        
        System.out.print("Jabatan : ");
        String jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok : ");
        int gaji = input.nextInt();
        
        System.out.print("Tunjangan jabatan : ");
        int tunjanganJ = input.nextInt();
        
        System.out.print("Tnjangaan istri : ");
         int tunjanganI = input.nextInt();
        
        System.out.print("Tnjangaan anak : ");
        int tunjanganA = input.nextInt();
                
        int total = gaji + tunjanganJ + tunjanganI + tunjanganA;
        System.out.println("======================================");
        System.out.println("Nomor induk karyawan : " + npm);
        System.out.println("Nama karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Tunangan jabatan : " + tunjanganJ);
        System.out.println("Tunjangan istri : " + tunjanganI);
        System.out.println("Tunjangan anak : " + tunjanganA);
        System.out.println("Total Gaji : " + total);
        System.out.println("Pajak  : " + (0.10*total));
        System.out.println("Gaji Bersih: " + (total - (0.10*total)));
    }
            
}
