
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class load {
// public load() {
 // }
  public static boolean main(String[] args) {
    if (args.length<2) {
 //     System.out.println("copy soubor1 do soubor2");
      System.out.println("nacteni souboru");
      return true;
    }
    InputStream enter = null;
    OutputStream exit = null;
    // otevření prvního souboru pro čtení a založení vstupního proudu
    try {
      enter = new FileInputStream(args[0]);
    } catch (IOException e) {
      System.out.println("Soubor "+args[0]+" se nepodarilo otevrit!");
      return false;
    }
    
            int[] pole = new int[3];
            pole[0] = 3;
            try {
            ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("mojedata.dat"));    
            out.writeObject(pole);
            out.close();
        } catch (Exception e) {
            System.out.println("Chyba :" + e);
        }
    
      /* otevření druhého souboru pro zápis a založení výstupního proudu
    try {
      vystup = new FileOutputStream(args[1]);
      } catch (IOException e) {
        System.out.println("Soubor "+args[1]+" se nepodarilo vytvorit!");
        return;
      }
    // kopírování obsahu souboru
    byte data[] = new byte[1024];
    int pocet;
    try {
      while (vstup.available()>0) {
        pocet = vstup.read(data);
        vystup.write(data, 0, pocet);
      }
    }
    catch (IOException ex) {
      System.out.println("Nastala chyba pri kopirovani souboru!");
    }*/
      return true;
  }  
}
