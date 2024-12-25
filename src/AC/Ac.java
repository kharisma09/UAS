/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;
/**
 *
 * @author user
 */
public class Ac implements Interface {
    int statusAc;
    int statusSuhu;

    public void matikan() {
        if (statusAc == KEADAAN_HIDUP_AC) {
            statusAc = KEADAAN_MATI_AC;
            System.out.println("\nMatikan AC --> Ac di matikan ");
        } else {
            System.out.println("\nMatikan AC --> Ac di matikan!!!");
        }
    }

    public void hidupkan() {
        if (statusAc == KEADAAN_MATI_AC) {
            statusAc = KEADAAN_HIDUP_AC;
            System.out.println("\nHidupkan AC --> Ac di hidupkan ");
        } else {
            System.out.println("\nHidupkan AC --> Ac di hidupkan!!!");
        }
    }

    public void dinginkan() {
        if (statusAc == KEADAAN_PANAS_AC) {
            statusAc = KEADAAN_DINGIN_AC;
            System.out.println("\nDinginkan AC --> Ac di di dinginkan ");
        } else {
            System.out.println("\nDinginkan AC --> Ac di dinginkan!!!");
        }
    }

    public void panaskan() {
        if (statusAc == KEADAAN_DINGIN_AC) {
            statusAc = KEADAAN_PANAS_AC;
            System.out.println("\nPanaskan AC --> Ac di di panaskan ");
        } else {
            System.out.println("\nPanaskan AC --> Ac di panaskan!!!");
        }
    }

    
}
