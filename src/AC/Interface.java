/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author user
 */
public interface Interface {
    public static int KEADAAN_MATI_AC = 0;
    public static int KEADAAN_HIDUP_AC = 1;
    public static int KEADAAN_DINGIN_AC = 0;
    public static int KEADAAN_PANAS_AC = 1;

    public abstract void matikan();
    public abstract void hidupkan();
    public abstract void dinginkan();
    public abstract void panaskan();
    
}
