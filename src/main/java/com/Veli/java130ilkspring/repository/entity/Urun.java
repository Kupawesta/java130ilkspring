package com.Veli.java130ilkspring.repository.entity;

import javax.persistence.*;

@Entity
@Table(name="tblurun")
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String ad;
    String barkod;
    String marka;
    String model;
    double fiyat;
    int stokmiktari;

    public Urun() {
    }

    public Urun(String ad, String barkod, String marka, String model, double fiyat, int stokmiktari) {
        this.ad = ad;
        this.barkod = barkod;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        this.stokmiktari = stokmiktari;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", barkod='" + barkod + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat=" + fiyat +
                ", stokmiktari=" + stokmiktari +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokmiktari() {
        return stokmiktari;
    }

    public void setStokmiktari(int stokmiktari) {
        this.stokmiktari = stokmiktari;
    }
}
