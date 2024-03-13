/**
 * File: MPoligon.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas: " + persegi.hitungLuas());
    }
}