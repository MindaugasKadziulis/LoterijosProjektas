package org.mindaugas.loterija.app;

import org.mindaugas.loterija.BilietoNumeris;
import org.mindaugas.loterija.bilietuaparatas.BilietoGeneravimas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Main {
    public static void main(String[] args) {
       BilietoNumeris id = new BilietoNumeris();
        
      BilietoGeneravimas bg = new BilietoGeneravimas();
        System.out.println(bg.pasirinkimas());
       
    }
}
