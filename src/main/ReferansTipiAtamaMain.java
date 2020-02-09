package main;

import object.Ogrenciler;

public class ReferansTipiAtamaMain {
    public static void main(String[]args){

        int sayi1= 40;
        int sayi2 = sayi1; //sayi1= 40 , sayi2=40
        sayi1 =50; //sayi1= 50 , sayi2=40

        // referans tipi atama
        Ogrenciler ogrenci1= new Ogrenciler();
        ogrenci1.isim ="Ahmet";
        System.out.println(ogrenci1.isim);


        Ogrenciler ogrenci2 = ogrenci1;
        ogrenci2.isim ="Zeynep";
        System.out.println(ogrenci1.isim);



    }
}
