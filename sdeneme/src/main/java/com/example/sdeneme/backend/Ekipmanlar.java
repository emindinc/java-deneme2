package com.example.sdeneme.backend;

public class Ekipmanlar {
    protected String isim, malzemeTuru;
    protected int miktar;

    public Ekipmanlar(String isim, String malzemeTuru, int miktar) {
        this.isim = isim;
        this.malzemeTuru = malzemeTuru;
        this.miktar = miktar;
    }
}
