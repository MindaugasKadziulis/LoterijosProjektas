package org.mindaugas.loterija;

import org.mindaugas.loterija.modelis.Bilietas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.mindaugas.loterija.modelis.Laimejimas;
import org.mindaugas.loterija.modelis.Skaicius;
import static org.mindaugas.loterija.modelis.Skaicius._2;
import static org.mindaugas.loterija.modelis.Skaicius._3;
import static org.mindaugas.loterija.modelis.Skaicius._4;
import static org.mindaugas.loterija.modelis.Skaicius._5;
import static org.mindaugas.loterija.modelis.Skaicius._6;
import static org.mindaugas.loterija.modelis.Skaicius._7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M
 */
public class Loterija  {

//    private Skaicius[] seka;
    private Skaicius[] laimingisSkaiciai;

    private List<Bilietas> bilietai = new ArrayList<>();

    private List<Laimejimas> laimingi = new ArrayList<>();

//    public Loterija(Skaicius[] seka) {
//        
//    }

    private void bilietuSarasas() {

        bilietai.add(new Bilietas(_2, _3, _4, _5, _6));
        bilietai.add(new Bilietas(_2, _3, _4, _5, _6));

    }

    public Bilietas nusipirktiBilieta(Skaicius s1, Skaicius s2, Skaicius s3, Skaicius s4, Skaicius s5) {

        return null;
    }
    /*
    public int tikrinti(Bilietas arLaimingas) {
    int atspetiSkaiciai = 0;
    for (int p = 0; p < laimingi.size(); p++) {
    // for (int j = 0; j < seka.length; j++) {
    while (bilietai.contains(laimingi)) {
    return atspetiSkaiciai++; // pagal pirktu bilietu didi nustatyti proporcijas
    }
    }
    }
    //tikrinti tarp laimingi, o ne tarp bilietu
    
    return 0;
    }*/

    public List<Laimejimas> laimetojai() {
        return laimingi;
    }

    public void losimoZaidimas(){
        generuotiSeka();
        atrinktiLaimetojus();
    }
    
    
    private void generuotiSeka() {

        Random random = new Random();

        for (int i = 0; i < laimingisSkaiciai.length; i++) {
            laimingisSkaiciai[i] = Skaicius.values()[random.nextInt(Skaicius.values().length)];
        }
       
    }
    
    private void atrinktiLaimetojus (){
        
        //laimingisSkaiciai;
         bilietai.clear();
         
         
        // laimingi;
    }
    
    
    // 
}
