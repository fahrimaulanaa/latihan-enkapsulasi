package Enkap2;

import Enkap1.Enkapsulasi1;

public class Enkap22 {
    public static void main(String[] args) {
        Enkapsulasi1 enkapsulasi1 = new Enkapsulasi1();
        Enkapsulasi1 enkapsulasi4 = new Enkapsulasi1();

        //memanggil public method dari package Enkap1 dan class Enkapsulasi1 pada method lpersegi
        System.out.println("Luas persegi: ");
        enkapsulasi1.lpersegi();
        System.out.println("\n");

        //memanggil public method dari package Enkap1 dan class Enkapsulasi1 pada method lpersegipanjang
        System.out.println("Luas persegi panjang: ");
        enkapsulasi4.luaslingkaran();       
    }
}
