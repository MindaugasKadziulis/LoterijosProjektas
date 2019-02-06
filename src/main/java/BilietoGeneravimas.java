
import static java.lang.Math.random;
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
public class BilietoGeneravimas {

    Scanner input = new Scanner(System.in);

    private int[] loterijosSkaiciuSeka;

    private String skaiciuIvedimas() {
        
        for (int i = 0; i < loterijosSkaiciuSeka.length; i++) {
            System.out.println("Please enter number");
            loterijosSkaiciuSeka[i] = input.nextInt();
            return "jusu pasirinkti skaiciai:" + skaiciuIvedimas();
            
            
        }
        
        
return null;
    }
    
    private String atsitiktinaiGeneruojamiSkaiciai (){
        
          Random random = new Random();
          
        for (int i = 0; i < loterijosSkaiciuSeka.length; i++) 
            loterijosSkaiciuSeka[i] = random.nextInt();
        return "jums sugeneruoti :" + atsitiktinaiGeneruojamiSkaiciai();
     
    }
    

}
