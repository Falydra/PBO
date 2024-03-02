package org.bangunruang;


//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class LimasSegiempat{
  private double alas;
  private double tinggi;
  private double tinggiLimas;

  public LimasSegiempat(double alas, double tinggi, double tinggiLimas) {
    this.alas = alas;
    this.tinggi = tinggi;
    this.tinggiLimas = tinggiLimas;
  }
  public void setAlas(double alas){
    this.alas = alas;
  }

  public void setTinggi(double tinggi){
    this.tinggi = tinggi;
  }

  public void setTinggiLimas(double tinggiLimas){
    this.tinggiLimas = tinggiLimas;
  }

  public double getAlas(){
    return this.alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public double getTinggiLimas() {
    return tinggiLimas;
  }

  public double hitungLuasAlas() {
    return alas * tinggi;
  }
  public double hitungVolume() {
    return (alas * tinggi) / 3;
  }
}