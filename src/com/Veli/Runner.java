package com.Veli;

import com.Veli.entity.Musteri;

public class Runner {
    public static void main(String[] args) {
        Musteri mst =new Musteri();
        mst.ad = "Veli";
        mst.soyad = "CANLI";
        mst.sayac = 13;
       //---------------------------
        Musteri mst2 = new Musteri();
        mst2.ad ="Emre";
        mst2.soyad ="YILMAZ";
        mst2.sayac =43;
       //-------------------------------
        /**
         * Static değerlerin new lenerek erişilmesine gerek yoktur.
         * Musteri.sayac=567;
         * bu şekilde değiştirilebilir.
         */
        System.out.println("Müsteri1...: ");
        System.out.println(mst.ad+" "+mst.soyad);
        System.out.println("sayaç....: "+mst.sayac);
        System.out.println();
        System.out.println("Müsteri2...: ");
        System.out.println(mst2.ad+" "+mst2.soyad);
        System.out.println("sayaç....: "+mst2.sayac);
    }
}
