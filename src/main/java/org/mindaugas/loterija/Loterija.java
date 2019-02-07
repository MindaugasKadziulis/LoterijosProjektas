package org.mindaugas.loterija;


import org.mindaugas.loterija.modelis.Bilietas;

import java.util.ArrayList;
import java.util.List;
import org.mindaugas.loterija.modelis.Laimejimas;
import org.mindaugas.loterija.modelis.Skaicius;
import static org.mindaugas.loterija.modelis.Skaicius._2;
import static org.mindaugas.loterija.modelis.Skaicius._3;
import static org.mindaugas.loterija.modelis.Skaicius._4;
import static org.mindaugas.loterija.modelis.Skaicius._5;
import static org.mindaugas.loterija.modelis.Skaicius._6;
import static org.mindaugas.loterija.modelis.Skaicius._7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Loterija {
    
    private List<Bilietas> bilietai = new ArrayList<>();
    
    private List<Laimejimas> laimingi = new ArrayList<>();
   
    
//    BilietoNumeris bn = new BilietoNumeris();
//   // Bilietas bl = new Bilietas(234);
//    
//    private void bilietuSarasas (){
//    
//    
//    bilietai.add(new Bilietas( _2,_3,_4,_5,_6 ));
//    bilietai.add(new Bilietas( _2,_3,_4,_5,_6 ));
    
//            }
    
    
    public Bilietas nusipirktiBilieta (Skaicius s1, Skaicius s2, Skaicius s3, Skaicius s4, Skaicius s5){
        return null;
    }
    public int tikrinti (Bilietas arLaimingas){
        
        //tikrinti tarp laimingi, o ne tarp bilietu
        
        return 0;
    }
    
    public void zaidimas (){
        // sugeneruoti laimingu skaicius seka
        //laimingi
        
        bilietai.clear();
    }
    
    public List<Laimejimas> laimetojai (){
        return laimingi;
    }
            
}
