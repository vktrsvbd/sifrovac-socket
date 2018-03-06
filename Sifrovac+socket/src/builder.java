/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public abstract class builder {
    //    int x, y;
     protected String retezec;   

     
     public builder(String retezec) {

        this.retezec = retezec;

    }
    
    public void sifruj() {
        System.out.println("sifruj " + retezec );
     
    }
    public String getRetezec() {

        return retezec;

    }
    
    public void desifruj() {
        System.out.println("desifruj " + retezec );
     
    }
    
    /*
    void moveTo(int newX, int newY) {
        
    }
    abstract void draw();
    abstract void resize();*/
}
    
