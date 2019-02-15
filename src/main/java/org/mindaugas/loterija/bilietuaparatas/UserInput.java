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
import org.mindaugas.loterija.bilietuaparatas.IvedamiSkaiciai;

/**
 *
 * @author M
 */
public class UserInput {

    List<Skaicius> seka;
    Bilietas bil = new Bilietas(Skaicius._1, Skaicius._2, Skaicius._3, Skaicius._4, Skaicius._5);
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String choose = input.nextLine();

    public String userInput(String IvedamiSkaiciai, String RandomSkaiciai) {

        System.out.println("Ivesti skaicius - rasyti iv generuoti skaicius rasyti gen");
        if (choose == "iv") {
            return IvedamiSkaiciai;

        }
        if (choose == "gen") {
            return RandomSkaiciai;
        }

        return "Klaida bandykite dar karta";

    }
}
