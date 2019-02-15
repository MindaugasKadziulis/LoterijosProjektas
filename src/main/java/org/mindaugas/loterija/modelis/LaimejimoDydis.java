package org.mindaugas.loterija.modelis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mindaugas.loterija.SekuPalyginimas;

/**
 *
 * @author M
 */
public class LaimejimoDydis {

    private SekuPalyginimas sPal = new SekuPalyginimas();

    private Map<LaimejimuDalis, Integer> laimejimuKiekiai = null;

    private static final double PRIZ_FONDO_KOEF = 0.7;

    public LaimejimoDydis() {

        laimejimuKiekiai = new HashMap<>();

        for (LaimejimuDalis ld : LaimejimuDalis.values()) {
            laimejimuKiekiai.put(ld, 0);
        }

    }

    public Map<LaimejimuDalis, Double> isdalintiPriziniFonda(List<Skaicius> laimingisSkaiciai, List<Bilietas> bilietai, double prizinisFondas, double laimejimoSlenkstis) {

        for (Bilietas bilietas : bilietai) {
            LaimejimuDalis ld = sPal.sekuLyginimas(laimingisSkaiciai, bilietas.getSeka());
            laimejimuKiekiai.replace(ld, laimejimuKiekiai.get(ld) + 1);

        }

        Map<LaimejimuDalis, Double> laimejimuSumos = null;

        for (int i = LaimejimuDalis.values().length; i >= 0; --i) {
            Integer laim = laimejimuKiekiai.get(LaimejimuDalis.values()[i]);
            double bilPrizas = (prizinisFondas * PRIZ_FONDO_KOEF) / laim;

            if (bilPrizas > laimejimoSlenkstis) {
                laimejimuSumos.put(LaimejimuDalis.values()[i], bilPrizas);
            }
        }

        return laimejimuSumos;
    }

}
