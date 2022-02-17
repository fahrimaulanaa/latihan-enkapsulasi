package Enkap1;

import java.util.Scanner;
public class Enkapsulasi1{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //memanggil private method lpersegi
        System.out.println("Keliling persegi: ");
        System.out.println("Rumus: s * 4");
        kpersegi();
    }

    //Public method yang akan diakses oleh Enkap22
    public void lpersegi() {
        System.out.println("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();
        int luas = sisi * sisi;
        System.out.println("Luas persegi: "+luas);
    }

    //protected method yang akan diakses oleh Enkap22 dan pemanggilan
    protected void lpersegipanjang(){
        System.out.println("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.println("Masukkan lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang: "+luas);
    }

    //private method yang akan diakses oleh pemanggilan
    private static void kpersegi() {
        System.out.println("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();
        int keliling = 4 * sisi;
        System.out.println("Keliling persegi: "+keliling);
    }

    //public method yang akan diakses oleh Enkap22
    public void luaslingkaran(){
        double phi = 3.14;
        System.out.println("Masukkan jari jari: ");
        double jarijari = sc.nextDouble();
        double luas = phi * jarijari * jarijari;
        System.out.println("Luas lingkaran: "+luas);
    }
}