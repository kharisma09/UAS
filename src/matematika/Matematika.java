/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author cha
 */
public class Matematika {
    int hasil;

    void pertambahan(int a, int b) {
        hasil = a + b;
        System.out.println("Hasil Pertambahan : " + a + " + " + b + " : " + hasil);
    }

    void pengurangan(int a, int b) {
        hasil = a - b;
        System.out.println("Hasil Pengurangan :" + a + " - " + b + " : " + hasil);
    }

    void perkalian(int a, int b) {
        hasil = a * b;
        System.out.println("Hasil Perkalian : " + a + " * " + b + " : " + hasil);
    }

    void pembagian(int a, int b) {
        hasil = a / b;
        System.out.println("Hasil Pembagian : " + a + " / " + b + " : " + hasil);
    }
    
}
