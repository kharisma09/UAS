/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author user
 */
public class AcBeraksi {
    public static void main(String[] args) {
        Ac acku  = new Ac();
        
        System.out.println("Status Ac Saat ini : Mati");
        acku.hidupkan();
        acku.matikan();
        acku.matikan();
        acku.hidupkan();
        acku.hidupkan();
        
        System.out.println("\nStatus dingin ac saat ini : Panas");
        acku.dinginkan();
        acku.panaskan();
        acku.panaskan();
        acku.dinginkan();
        acku.dinginkan();
    }

    
}
