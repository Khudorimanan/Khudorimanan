/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama1;
import java.io.Console;
/**
 *
 * @author khudo
 */
public class New_Console {public static void main(String[] args) {
        String nama;
        int usia;
        Console masukan = System.console();
        System.out.println("Masukkan Nama anda : ");
        nama = masukan.readLine();
        System.out.println("Masukkan Usia anda : ");
        usia = Integer.parseInt(masukan.readLine());
        System.out.println("Nama mu adalah : " + nama);
        System.out.println("Usia mu adalah : " + usia);
    }
    
}
