cd
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M
 */
public class BilietuSkaiciai {

    private int[] generuojamiSkaiciai;
    private int[] zaidejoSkaiciai;

    private String IvestiArGeneruoti(int sk) {
        int skaitmenuKiekis = 0;
        generuojamiSkaiciai = new int[skaitmenuKiekis];
        Random random = new Random();

        switch (sk) {
            case 1:
                for (int i = 0; i < zaidejoSkaiciai.length; i++) {
                    return "Jūsų pasirinkti skačiai";
                }
                ;
            case 2:
                for (int i = 0; i < generuojamiSkaiciai.length; i++) {
                    generuojamiSkaiciai[skaitmenuKiekis] = random.nextInt(10);
                    return "Jums sugeneruoti skaičiai";
                }
                ;

        }
        return "Prašome įvesti tinkamą skaitmenų kiekį arba lesti sugeneruoti skaičius";
        
    }

    public void setIvestiSkaiciai(int[] ivestiSkaiciai) {
        this.zaidejoSkaiciai = ivestiSkaiciai;
    }

    public void zaidejoIvestiSkaiciai(int[] ivestaSkaiciuSeka) {
        zaidejoSkaiciai = ivestaSkaiciuSeka;

    }

    public BilietuSkaiciai(int skaitmenuKiekis) { //turi but laimingas skaicius
        Random random = new Random();

        generuojamiSkaiciai = new int[skaitmenuKiekis];

        for (int i = 0; i < generuojamiSkaiciai.length; i++) {
            generuojamiSkaiciai[skaitmenuKiekis] = random.nextInt(10);

        }

    }
}
