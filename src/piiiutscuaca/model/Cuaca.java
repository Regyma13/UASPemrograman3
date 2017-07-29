/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piiiutscuaca.model;

/**
 * model untuk menampung data cuaca
 * @author hahn
 */
public class Cuaca {
    
    private String id;
    private String namaKota;
    private double suhu;
    private double suhuMaks;
    private double suhuMin;
    private double kecepatanAngin;
    private double kelembapan;
    private double tekanan;

    public Cuaca(String id, String namaKota, double suhu, 
            double suhuMaks, double suhuMin, double kecepatanAngin,
            double kelembapan, double tekanan) {
        this.id = id;
        this.namaKota = namaKota;
        this.suhu = suhu;
        this.suhuMaks = suhuMaks;
        this.suhuMin = suhuMin;
        this.kecepatanAngin = kecepatanAngin;
        this.kelembapan = kelembapan;
        this.tekanan = tekanan;
    }

    public Cuaca() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    public double getSuhu() {
        return suhu;
    }

    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }

    public double getSuhuMaks() {
        return suhuMaks;
    }

    public void setSuhuMaks(double suhuMaks) {
        this.suhuMaks = suhuMaks;
    }

    public double getSuhuMin() {
        return suhuMin;
    }

    public void setSuhuMin(double suhuMin) {
        this.suhuMin = suhuMin;
    }

    public double getKecepatanAngin() {
        return kecepatanAngin;
    }

    public void setKecepatanAngin(double kecepatanAngin) {
        this.kecepatanAngin = kecepatanAngin;
    }
    
    public double getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(double kelembapan) {
        this.kelembapan = kelembapan;
    }

    public double getTekanan() {
        return tekanan;
    }

    public void setTekanan(double tekanan) {
        this.tekanan = tekanan;
    }
    
}
