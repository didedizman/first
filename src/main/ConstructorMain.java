package main;

import object.Ogrenciler;

public class ConstructorMain {
    public static void main(String[]args){

        Ogrenciler ogrenci = new Ogrenciler();
        // new dedigimiz anda yeni constructor olusturur parantez bossa bos constructor olusturur

        ogrenci.adres="Ankara";
        ogrenci.isim= "Mehmet";
        ogrenci.okulNo= 1234;

        System.out.println(ogrenci.isim);

        Ogrenciler ogrenci2 = new Ogrenciler("Ahmet", 5678, "ISTANBUL");
        System.out.println(ogrenci2.adres);


    }
}
