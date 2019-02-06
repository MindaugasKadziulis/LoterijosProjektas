
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class BilietoNumeris {
    
    private static int bilietoNumerioSkaiciuokle = 0;
    private int bilietoNumeris;
    
    /**
     *
     */
    public BilietoNumeris (){
        
        bilietoNumeris = ++bilietoNumerioSkaiciuokle;
         }
public int getNumber() {
		return bilietoNumeris;
	}

    public int getBilietoNumeris() {
        return bilietoNumeris;
    }

    public void setBilietoNumeris(int bilietoNumeris) {
        this.bilietoNumeris = bilietoNumeris;
    }

  
}