package object;

public class Ogrenciler {
    //Global degisken
    String isim;
    int okulNo;
    String adres;
    // bos constroctor
    public Ogrenciler(){

    }
    //Dolu constructor
    public Ogrenciler(String isim, int okulNo, String adres){
        //Shadowing lokal degiskenler golabal degiskenlere ataniyor.
        //sag taraftakiler lokal degiskendir
        this.isim=isim;
        this.okulNo= okulNo;
        this.adres=adres;


    }
}
