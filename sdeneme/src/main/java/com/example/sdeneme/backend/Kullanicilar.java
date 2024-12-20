package com.example.sdeneme.backend;

public class Kullanicilar {
    private String ad, soyad, ID, sifre;

    public Kullanicilar(String ad, String soyad, String ID, String sifre) {
        this.ad = ad;
        this.soyad = soyad;
        this.ID = ID;
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}

