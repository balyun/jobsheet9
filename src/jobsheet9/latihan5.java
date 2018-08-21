/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

/**
 *
 * @author Client
 */
public class latihan5 {
    public static void main(String [] args) { 
        int angka1, angka2, angka3, maks;
        angka1 = 12;
        angka2 = 21;
        angka3 = 14;
        if (angka1>angka2 && angka1>angka3) {
            maks = angka1;
            
        }else if (angka2>angka1 && angka2>angka3) {
            maks = angka2;
        }else{
            maks= angka3;
        }
        System.out.println("Angka maksimum adalah : " + maks);
    }
}
