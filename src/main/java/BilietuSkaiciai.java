import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class BilietuSkaiciai {
    private int [] generuojamiSkaiciai;
    private int [] ivestiSkaiciai;

    public int[] getIvestiSkaiciai() {
       
        return ivestiSkaiciai;
    }

    public void setIvestiSkaiciai(int[] ivestiSkaiciai) {
        this.ivestiSkaiciai = ivestiSkaiciai;
    }
    
    public void zaidejoIvestiSkaiciai( int [] ivestaSkaiciuSeka) {
        ivestiSkaiciai = ivestaSkaiciuSeka;
    
    }
    
    public BilietuSkaiciai( int skaitmenuKiekis){
        Random random = new Random();
        
        generuojamiSkaiciai = new int [skaitmenuKiekis];
        
        for (int i = 0; i < generuojamiSkaiciai.length; i++){
            generuojamiSkaiciai[skaitmenuKiekis] = random.nextInt(10);
            
   
    }
    
        
    }
}
