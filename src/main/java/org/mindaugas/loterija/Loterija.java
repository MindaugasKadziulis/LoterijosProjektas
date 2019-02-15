package org.mindaugas.loterija;

import org.mindaugas.loterija.modelis.Bilietas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.mindaugas.loterija.modelis.Laimejimas;
import org.mindaugas.loterija.modelis.LaimejimoDydis;
import org.mindaugas.loterija.modelis.Skaicius;
import static org.mindaugas.loterija.modelis.Skaicius._2;
import static org.mindaugas.loterija.modelis.Skaicius._3;
import static org.mindaugas.loterija.modelis.Skaicius._4;
import static org.mindaugas.loterija.modelis.Skaicius._5;
import static org.mindaugas.loterija.modelis.Skaicius._6;
import static org.mindaugas.loterija.modelis.Skaicius._7;

public class Loterija {

    private static final double PELNO_MARZA = 0.3;

    private List<Skaicius> laimingisSkaiciai;

    private List<Bilietas> bilietai = new ArrayList<>();

    private List<Laimejimas> laimingi = new ArrayList<>();

    private LaimejimoDydis laimejimuSkaiciuotuvas = new LaimejimoDydis();
    private double bilietoKaina;

    public Loterija(double bilietoKaina) {
        this.bilietoKaina = bilietoKaina;
    }

    public int getVisiBilietai() {
        return bilietai.size();
    }

    public Bilietas nusipirktiBilieta(Skaicius s1, Skaicius s2, Skaicius s3, Skaicius s4, Skaicius s5) {
        Bilietas biliet = new Bilietas(_2, _3, _4, _5, _6);
        bilietai.add(biliet);
        return biliet;
    }

    public List<Laimejimas> laimetojai() {

        return laimingi;
    }

    public void losimoZaidimas() {
        generuotiSeka();

        double prizinisFondas = bilietoKaina * bilietai.size() * (1 - PELNO_MARZA);
        laimejimuSkaiciuotuvas.isdalintiPriziniFonda(laimingisSkaiciai, bilietai, prizinisFondas, bilietoKaina);

        bilietai.clear();
    }

    private void generuotiSeka() {

        Random random = new Random();

        for (int i = 0; i < laimingisSkaiciai.size(); i++) {
            laimingisSkaiciai.add(Skaicius.values()[random.nextInt(Skaicius.values().length)]);
        }

    }

}
