package org.walimahasiswa;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class WaliMahasiswa{
  private String nomorHP;
  private String alamat;
  private String nik;
  private String nama;

  public WaliMahasiswa(String nama, String nik, String nomorHP, String alamat){
    this.nik = nik;
    this.nama = nama;
    this.nomorHP = nomorHP;
    this.alamat = alamat;
  }

  public void setNik(String nik){
    this.nik = nik;
  }

  public void setNama(String nama){
    this.nama = nama;
  }
  public void setNomorHP(String nomorHP){
    this.nomorHP = nomorHP;
  }
  public void setAlamat(String alamat){
    this.alamat = alamat;
  }
  

  public String getNomorHP(){
    return nomorHP;
  }

  public String getAlamat(){
    return alamat;
  }

  public String getNik(){
    return nik;
  }

  public String getNama(){
    return nama;
  }

  public void getInfo(){
    System.out.println("Nama: " + nama);
    System.out.println("nik: " + nik);
    System.out.println("Alamat: " + alamat);
    

    System.out.println("No Telp: " + nomorHP);
  }
  
  
}