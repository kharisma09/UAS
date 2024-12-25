/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author user
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank ku = new Bank(100000);
        ku.getSaldo();
        ku.simpanSaldo(5000000);
        ku.ambilSaldo(100000);
    }
}
