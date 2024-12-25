/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;


public class BMI {
    float berat;
    float tinggi;
    String jenisKelamin;
    
    public BMI(float berat , float tinggi){
        this.berat = berat;
        this.tinggi = tinggi;
        
    }
    public float hitung(){
        float meter = tinggi / 100;
        return berat / (meter * meter);
    }
    public String getStatus(){
        float BMI = hitung();
        if(BMI < 18.5){
            return "kurus";
        }else if(BMI < 24.9){
            return "normal";

        }else if(BMI < 26.9){
            return "berat ideal";
        }else{
            return "obesitas";
        }
    }
        
    public void getBerhasil(int pilihanKelamin){ 
        float BMI = hitung();
        System.out.println("======Hasil======");
        jenisKelamin = switch(pilihanKelamin){
            case 1 ->
                "Laki-laki";
            case 2 ->
                "Perempuan";
            default ->
                "tidak valid";
};
            
            System.out.println(" Jenis kelamin : " + jenisKelamin);  
            System.out.println("BMI anda : " + BMI );
            System.out.println("Status kesehatan : " + getStatus());
            System.out.println("======terimakasih=======");
    }
    
        
    

    
}
