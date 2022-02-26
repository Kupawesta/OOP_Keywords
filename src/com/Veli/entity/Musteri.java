package com.Veli.entity;

public class Musteri {
    public static int sayac=0;
    public String ad;
    public String soyad;
    public Musteri(){
        sayac++;
    }
    public void kaydet(String ad,String soyad){
        this.ad = ad;
        this.soyad=soyad;
        System.out.println("Müşteri kaydedildi.");
    }

}
