/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindaugas.loterija.modelis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mindaugas.loterija.Loterija;
import org.mindaugas.loterija.SekuPalyginimas;

/**
 *
 * @author M
 */
public class LaimejimoDydis {

    private SekuPalyginimas sPal = new SekuPalyginimas();

    private double bilietoKaina;
    private double laimetaSuma;
    private double surinktiPinigai;

    private Map<LaimejimuDalis, Integer> laimejimuKiekiai = null;
    
    private Map<LaimejimuDalis, Double> laimejimuSumos = null;

    public LaimejimoDydis(double bilietoKaina, double laimetaSuma, int bilietuKiekis) {
        this.bilietoKaina = bilietoKaina;
        this.laimetaSuma = laimetaSuma;
        this.surinktiPinigai = bilietoKaina * bilietuKiekis;

        laimejimuKiekiai = new HashMap<>();

        for (LaimejimuDalis ld : LaimejimuDalis.values()) {
            laimejimuKiekiai.put(ld, 0);
            laimejimuSumos.put(ld, 0.0);
        }

    }

    public double laimejimoDydis() {

        return laimetaSuma;

    }

    private void atrinktiLaimetojus(List<Skaicius> laimingisSkaiciai, List<Bilietas> bilietai) {

        for (Bilietas bilietas : bilietai) {
            LaimejimuDalis dd = sPal.sekuLyginimas(laimingisSkaiciai, bilietas.getSeka());
            laimejimuKiekiai.replace(dd, laimejimuKiekiai.get(dd) + 1);
        }

        //laimingiSkaiciai;
        bilietai.clear();
        
        
        //laimejimuSumos 

        // laimingi;
    }
}
