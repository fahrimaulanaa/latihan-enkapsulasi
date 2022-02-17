# latihan-enkapsulasi
Latihan Enkapsulasi tanggal 17 Februari 2022

**Penjelasan codingan:**

Jadi disini ada 2 package yaitu package `Enkap1` dan `Enkap2`, pada package `Enkap1` terdapat beberapa void yang berisi rumus matematika, pada package `Enkap1` terdapat 3 jenis 
method yaitu `public`, `static`, dan`private`. Sebagai contoh untuk public method ada pada void `lpersegi` dimana berisi rumus luas persegi.

void `lpersegi` dapat dipanggil di class mana saja bahkan package mana saja, karena dia bersifat `public`, sedangkan untuk protected void ada pada void `lpersegipanjang` yang berisi
luas persegi panjang. void `lpersegipanjang` dapat dipanggil di class mana saja asal pada satu package yang sama, hal ini disebabkan karena method nya adalah `protected'

Terakhir ada **private void** yang ada pada void `kpersegi` yang berisi keliling persegi, `kpersegi` hanya dapat dipanggil di class `Enkapsulasi1` yaitu class dimana void itu berada,
hal ini dikarenakan method dari void ini adalah **private**
