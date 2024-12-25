/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author user
 */
public class MatematikaBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        System.out.println("\n======Pertambahan=======");
        mtk.pertambahan(12.5, 28.7, 14.2);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(23, 34);
        mtk.pertambahan(3.4, 4.9);

        System.out.println("\n======Perkalian=======");
        mtk.perkalian(12.5, 28.7, 14.2);
        mtk.perkalian(12, 28, 14);
        mtk.perkalian(23, 34);
        mtk.perkalian(3.4, 4.9);

        System.out.println("\n======Pengurangan=======");
        mtk.pengurangan(12.5, 28.7, 14.2);
        mtk.pengurangan(12, 28, 14);
        mtk.pengurangan(23, 34);
        mtk.pengurangan(3.4, 4.9);

        System.out.println("\n======Pembagian=======");
        mtk.pembagian(12.5, 28.7, 14.2);
        mtk.pembagian(12, 28, 14);
        mtk.pembagian(23, 34);
        mtk.pembagian(3.4, 4.9);

        System.out.println("\n======Modulus=======");
        mtk.modulus(12.5, 28.7, 14.2);
        mtk.modulus(12, 28, 14);
        mtk.modulus(23, 34);
        mtk.modulus(3.4, 4.9);

    }
    
}
