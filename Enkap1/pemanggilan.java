package Enkap1;

public class pemanggilan {
    public static void main(String[] args) {
        Enkapsulasi1 enkapsulasi2 = new Enkapsulasi1();
        enkapsulasi2.lpersegipanjang(); //Memanggil protected method lpersegipanjang

        //Enkapsulasi1 enkapsulasi3 = new Enkapsulasi1(); {Karena private method}
        //enkapsulasi3.kpersegi();
    }
}
