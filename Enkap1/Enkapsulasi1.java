package Enkap1;

import java.util.Scanner;
public class Enkapsulasi1{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        kpersegi();
        //Memanggil private method harus di class yang sama
    }

    public void lpersegi() {
        System.out.println("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();
        int luas = sisi * sisi;
        System.out.println("Luas persegi: "+luas);
    }

    protected void lpersegipanjang(){
        System.out.println("Masukkan Panjang: ");
        int panjang = sc.nextInt();
        System.out.println("Masukkan lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang: "+luas);
    }

    private static void kpersegi() {
        System.out.println("Masukkan panjang sisi: ");
        int sisi = sc.nextInt();
        int keliling = 4 * sisi;
        System.out.println("Keliling persegi: "+keliling);
    }
}