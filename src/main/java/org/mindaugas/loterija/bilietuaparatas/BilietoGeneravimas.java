package org.mindaugas.loterija.bilietuaparatas;


import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
import org.mindaugas.loterija.modelis.Skaicius;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author M
 */
public class BilietoGeneravimas {

    Scanner input = new Scanner(System.in);

    private int[] loterijosSkaiciuSeka;
    private Skaicius[] seka;
    
    public String pasirinkimas(){
    System.out.println("Ivesti skaicius - rasyti iv generuoti skaicius rasyti gen");
    
    String choose = input.nextLine();
    if (choose == "iv"){
        return skaiciuIvedimas();
    }
    else if (choose == "gen"){
        return atsitiktinaiGeneruojamiSkaiciai();
                }
    else { 
        return "prasome irasyti iv ar gen";
        }
    }
    

    private String skaiciuIvedimas() {
        
        for (int i = 0; i < loterijosSkaiciuSeka.length; i++) {
            System.out.println("Please enter number");
            loterijosSkaiciuSeka[i] = input.nextInt();
            return "jusu pasirinkti skaiciai:" + loterijosSkaiciuSeka;
            
            
        }
        
        
return null;
    }
    
    private String atsitiktinaiGeneruojamiSkaiciai (){
        
        /*   Random random = new Random();
        
        for (int i = 0; i < seka.length; i++)
        seka[i] = random.nextInt();
        return "jums sugeneruoti skaiciai:" + seka;
        
        }
        */
return " ";
}
}
