/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindaugas.loterija;

import java.util.List;
import org.mindaugas.loterija.modelis.LaimejimuDalis;
import org.mindaugas.loterija.modelis.Skaicius;

/**
 *
 * @author M
 */
public class SekuPalyginimas {

    public LaimejimuDalis sekuLyginimas(List<Skaicius> seka1, List<Skaicius> seka2) {
        if (seka1.size() != seka2.size()) {
            throw new RuntimeException("Skiriasi dydziai");
        }

        int c = 0;
        for (int i = 0; i < seka1.size(); i++) {
            if (seka1.get(i) == seka2.get(i)) {

                c++;
            }
        }

        return LaimejimuDalis.values()[c];
        // i krepselius pagal enum 
    }

}
