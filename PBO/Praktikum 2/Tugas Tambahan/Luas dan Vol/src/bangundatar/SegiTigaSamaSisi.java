package org.bangundatar;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2


public class SegiTigaSamaSisi{
  private double alas;
  private double tinggi;

  public SegiTigaSamaSisi(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }
  public void setAlas(double alas){
    this.alas = alas;
  }

  public void setTinggi(double tinggi){
    this.tinggi = tinggi;
  }

  public double getAlas(){
    return this.alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public double hitungLuas() {
    return (alas * tinggi) / 2;
  }

  
}