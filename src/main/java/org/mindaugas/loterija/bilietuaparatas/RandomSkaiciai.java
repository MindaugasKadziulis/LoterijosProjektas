/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindaugas.loterija.bilietuaparatas;

import java.util.List;
import java.util.Random;
import org.mindaugas.loterija.modelis.Bilietas;
import org.mindaugas.loterija.modelis.Skaicius;

/**
 *
 * @author M
 */
public class RandomSkaiciai extends UserInput {

    private String generuotiSkaicius() {

        for (int i = 0; i < seka.size(); i++) {
            seka.add(Skaicius.values()[random.nextInt(Skaicius.values().length)]);
            return "jums sugeneruota seka:" + seka;

        }
        return "klaida";
    }

}
