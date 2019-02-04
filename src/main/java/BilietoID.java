/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class BilietoID {
      private static long bilietoID = 0;
    
    public static synchronized String sukurtiID(){
        return String.valueOf(bilietoID++);
    }

    public static long getBilietoID() {
        return bilietoID;
    }

    public static void setBilietoID(long bilietoID) {
        BilietoID.bilietoID = bilietoID;
    }
    
}

