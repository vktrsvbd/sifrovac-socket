/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public abstract class builder extends SifrovacSocket {
    //    int x, y;
     protected String retezec;   
     protected int sifra;

     
     public builder(String retezec/*, int sifra*/) {

        this.retezec = retezec;
        //this.sifra = sifra;
    }
     
   // public  void cipherstring {}
     
    public abstract void sifruj();
    
    public abstract void desifruj();
  /*  
    public abstract void sifruj(String) {
        System.out.println("sifruji" + retezec);
     
    }
    
    
    public abstract void desifruj(String) {
        System.out.println("desifruji" + retezec);
     
    }
    */
    /*
    void moveTo(int newX, int newY) {
        
    }
    abstract void draw();
    abstract void resize();*/
}
    
