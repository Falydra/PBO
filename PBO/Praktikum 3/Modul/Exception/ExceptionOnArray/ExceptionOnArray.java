/**
* File: ExceptionOnArray.java
* Nama: Daffa Aly Meganendra
* NIM : 24060122140140
* Deskripsi: Program untuk menunjukkan Exception pada sebuah array
*/

public class ExceptionOnArray {
   public static void main(String[] args) {
       Integer[] arrayInteger = new Integer[4];

       try {
           arrayInteger[2]= 11;
           arrayInteger[3] = 10;

       } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
       } finally {
           System.out.println("X");
       }
   }
}
