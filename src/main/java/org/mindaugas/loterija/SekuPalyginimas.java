/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindaugas.loterija;

import org.mindaugas.loterija.modelis.LaimejimuDalis;
import org.mindaugas.loterija.modelis.Skaicius;

/**
 *
 * @author M
 */
public class SekuPalyginimas {
    private LaimejimuDalis sekuLyginimas (Skaicius[] seka1, Skaicius[] seka2){
        if (seka1.length != seka2.length){
            throw new RuntimeException("Skiriasi dydziai");
        } 
        int c = 0;
        for (int i = 0; i < seka1.length; i++) {
            if (seka1 [i] == seka2 [i]){
               
                c++;
            }
        }
        
        return LaimejimuDalis.values()[c];
        // i krepselius pagal enum 
    }

}
