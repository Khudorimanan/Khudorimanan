/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author khudo
 */
public class New_Buffer {public static void main(String[] args) throws IOException {
        String NIK;
        String nama;
        int usia;
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Masukkan NIK : ");
        NIK = br.readLine();
        System.out.println("Masukkan Nama : ");
        nama = br.readLine();
        System.out.println("Masukkan Usia : ");
        usia = Integer.parseInt(br.readLine());
       
        
        System.out.println("Nik mu adalah : " + NIK);
        System.out.println("Nama mu adalah : " + nama);
        System.out.println("Usia mu adalah : " + usia);
       
    }
    
}
