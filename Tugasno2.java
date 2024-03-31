/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author windows 11
 */
public class Tugasno2 implements Serializable 
{ 
     // Normal variables 
    int i = 10, j = 20; 
  
    // Transient variables 
    transient int k = 30; 
  
    
     static int l = 40; 
     final int m = 50; 
      
  
    public static void main(String[] args) throws Exception 
    { 
        Tugasno2 input = new Tugasno2(); 
  
        // serialization 
        FileOutputStream fos = new FileOutputStream("abc.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(input); 
  
        // de-serialization 
        FileInputStream fis = new FileInputStream("abc.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        Tugasno2 output = (Tugasno2)ois.readObject(); 
        System.out.println("i = " + output.i); 
        System.out.println("j = " + output.j); 
        System.out.println("k = " + output.k); 
        System.out.println("l = " + output.l);   
        System.out.println("m = " + output.m); 
    } 
    //final : 
    //1.Pengubah ini berlaku untuk kelas, variabel, metode, dan blok luar dan dalam.
    //2. Tidak perlu menginisialisasi variabel akhir pada saat deklarasi.
    
    //Static:
    //1.Pengubah ini hanya berlaku untuk kelas dalam, metode, dan variabel.
    //2.Penting untuk menginisialisasi variabel statis pada saat deklarasi.
}
