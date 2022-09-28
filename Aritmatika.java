/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpertama1;

import java.util.Scanner;

/**
 *
 * @author khudo
 */
public class Aritmatika {
    public static void main(String[] args) {
        int detik, jam, menit, sisa;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("/Pengkonversian Massa/");        
            System.out.println("========================");        
            System.out.println("------------------------");
            System.out.print("Masukkan Nilai detik : ");
            detik = input.nextInt();
            
        }
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sisa = (detik % 3600) - (menit * 60);
        System.out.println(jam + "jam" + "-" + menit + "menit" + "-" + sisa + "detik");
    }
    
}
