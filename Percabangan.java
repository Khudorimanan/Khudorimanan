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
public class Percabangan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int angka = masukan.nextInt(); 
        if (angka%2==0) {
        if (angka>10) {
        System.out.println("Angka "+ angka + "adalah");
        System.out.println("Bilangan Genap");
            }
        } else {
        System.out.println("Angka "+ angka + " adalah");
        System.out.println("Bilangan Ganjil");   
        }
//   String hasil = angka%2==0? "Bilangan Genap":"Bilangan Ganjil";
//   System.out.println("Angka " + angka + " adalah \n")+ hasil;
        
    
    }
}
