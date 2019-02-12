package org.mindaugas.loterija.modelis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Bilietas {

    private static int numeriuSkaiciuokle = 1;
    private int bilietoNumeris;
    private Skaicius[] seka;

    public Bilietas(Skaicius s1, Skaicius s2, Skaicius s3, Skaicius s4, Skaicius s5) {
        bilietoNumeris = numeriuSkaiciuokle++;

        seka = new Skaicius[5];
        seka[0] = s1;
        seka[1] = s2;
        seka[2] = s3;
        seka[3] = s4;
        seka[4] = s5;
    }

    public int getBilietoNumeris() {
        return bilietoNumeris;
    }

    public void setBilietoNumeris(int bilietoNumeris) {
        this.bilietoNumeris = bilietoNumeris;
    }

    public Skaicius sekaVal(int i) {
        return seka[i];
    }

    public Bilietas(Skaicius[] seka) {
        this.seka = seka;
    }

 

   
   

}
