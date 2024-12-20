package com.example.sdeneme.backend;

import java.util.Scanner;

public class Sistem {
    Kullanicilar kullanici1 = new Kullanicilar("Emin","Dinc","1282845","blabla");
    /*
    Scanner scan = new Scanner(System.in);
    public void login(){
        String tempID, tempSifre;
        System.out.println("Kullanici ID'nizi giriniz: ");
        tempID = scan.nextLine();
        while (true){
            if(tempID.equals(kullanici1.getID())){
                System.out.println("Sifrenizi de giriniz: ");
                tempSifre = scan.nextLine();
                while (true){
                    if(tempSifre.equals(kullanici1.getSifre())){

                        break;
                    }
                    else{
                        System.out.println("Sifreniz yanlis! Tekrar deneyiniz.");
                        tempSifre = scan.nextLine();
                    }
                }
                break;
            }
            else{
                System.out.println("!!!Bu ID sisteme kayitli degil!!! Gecerli bir ID giriniz: ");
                tempID = scan.nextLine();
            }
        }
    }*/
}