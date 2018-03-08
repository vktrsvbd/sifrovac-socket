/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class CaesarCipher extends builder {
    
    public static final int SHIFT = 3;
    
    public CaesarCipher(String retezec) {
    super(retezec);
    }


    
    public static String encipher(String retezec){
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < retezec.length(); i ++){
            if(retezec.charAt(i) < 65 || retezec.charAt(i) > 90){ //znak v ASCII

                throw new IllegalArgumentException("" +
                "Sifrovany retezec neobsahuje jen velka pismena");
                }
                //modularne pricteme shift
                char enciphered = retezec.charAt(i) + SHIFT > 90 ? (char)((retezec.charAt(i) + SHIFT) - 26) : (char)(retezec.charAt(i) + SHIFT);

                builder.append(enciphered);
        }
        return builder.toString();
    }
    
    
    public static String decipher(String retezec){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < retezec.length(); i ++){
            if(retezec.charAt(i) < 65 || retezec.charAt(i) > 90){ //znak v ASCII
                throw new IllegalArgumentException("" +
                "Desifrovany retezec neobsahuje jen velka pismena");
            }
                //modularne odecteme shift
                char deciphered = retezec.charAt(i) - SHIFT < 65 ? (char)((retezec.charAt(i) - SHIFT) + 26) : (char)(retezec.charAt(i) - SHIFT);
                builder.append(deciphered);
        }
        return builder.toString();

    }


}
