package org.mindaugas.loterija.bilietuaparatas;

import static java.lang.Math.random;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.mindaugas.loterija.modelis.Bilietas;
import org.mindaugas.loterija.modelis.Skaicius;

public class BilietoGeneravimas {

    private List<Skaicius> seka;
    Bilietas bil = new Bilietas(Skaicius._1, Skaicius._2, Skaicius._3, Skaicius._4, Skaicius._5);
    Scanner input = new Scanner(System.in);

    
    
    /*  public String pasirinkimas() {
    System.out.println("Ivesti skaicius - rasyti iv generuoti skaicius rasyti gen");
    
    String choose = input.nextLine();
    if (choose == "iv") {
    return skaiciuIvedimas();
    } else if (choose == "gen") {
    return atsitiktinaiGeneruojamiSkaiciai(seka);
    } else {
    return "prasome irasyti iv ar gen";
    }
    }
    
    private String skaiciuIvedimas () {
    
    for (int i = 0; i < seka.size(); i++) {
    System.out.println("Prasome ivesti skaicius");
    seka.add(Skaicius.values()[input.nextInt(Skaicius.values().length)]);;
    return "jusu pasirinkti skaiciai:" + seka;
    
    }
    
    return null;
    }
    
    private String atsitiktinaiGeneruojamiSkaiciai(List<Skaicius> seka) {
    
    Random random = new Random();
    
    for (int i = 0; i < seka.size(); i++) {
    seka.add(Skaicius.values()[random.nextInt(Skaicius.values().length)]);
    return "jums sugeneruota seka:" + seka;
    
    }
    
    return " ";
    }*/
}
