/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Umbu Erien
 */
import java.util.Scanner;
public class BMIBERAKSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Selamat datang di kalkulator BMI=====");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan pilihan jenis kelamin anda (1/2): ");
        int pilihanKelamin = input.nextInt();
        
        System.out.print("masukkan tinggi badan anda : ");
        float tinggi = input.nextFloat();
        
        System.out.print("masukkan berat badan anda : ");
        float berat = input.nextFloat();
        
        BMI BmiApp = new BMI(berat , tinggi);
        
        BmiApp.getBerhasil(pilihanKelamin);
        
        input.close();

        
    }
    
    }
    

