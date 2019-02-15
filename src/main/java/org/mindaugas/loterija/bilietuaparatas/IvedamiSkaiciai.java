/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindaugas.loterija.bilietuaparatas;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.mindaugas.loterija.modelis.Bilietas;
import org.mindaugas.loterija.modelis.Skaicius;

/**
 *
 * @author M
 */
public class IvedamiSkaiciai extends UserInput {

 private String ivedamiSkaiciai () {

        for (int i = 0; i < seka.size(); i++) {
            System.out.println("Prasome ivesti skaicius");
            seka.add(Skaicius.values()[input.nextInt(Skaicius.values().length)]);;
            return "jusu pasirinkti skaiciai:" + seka;

        }

        return null;
    }

    public List<Skaicius> getSeka() {
        return seka;
    }

    public Bilietas getBil() {
        return bil;
    }

    public Random getRandom() {
        return random;
    }

    public Scanner getInput() {
        return input;
    }

     
}
