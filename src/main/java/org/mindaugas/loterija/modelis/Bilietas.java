package org.mindaugas.loterija.modelis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bilietas {

    private static int numeriuSkaiciuokle = 1;
    private int bilietoNumeris;
    private List<Skaicius> seka = null;

    public Bilietas(Skaicius s1, Skaicius s2, Skaicius s3, Skaicius s4, Skaicius s5) {
        bilietoNumeris = numeriuSkaiciuokle++;

        seka = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

    }

    public int getBilietoNumeris() {
        return bilietoNumeris;
    }

    public void setBilietoNumeris(int bilietoNumeris) {
        this.bilietoNumeris = bilietoNumeris;
    }

    public Skaicius sekaVal(int i) {
        return seka.get(i);
    }

    public List<Skaicius> getSeka() {
        return new ArrayList<>(seka);
    }

}
