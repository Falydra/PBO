package org.main;

import org.kendaraan.*;
import org.motor.Motor;
import org.mobil.Mobil;
import org.truk.Truk;

/**
 * File: MKendaraan.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

public class MKendaraan {
    public static void main(String [] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan ");
        Mobil mobil = new Mobil("Bugatti Chiron ", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 1000);
        Truk truk = new Truk("Mercedes-Benz Actros", 9);

        kendaraan.klakson();
        motor.klakson();
        mobil.klakson();
        truk.klakson();


    }
}
