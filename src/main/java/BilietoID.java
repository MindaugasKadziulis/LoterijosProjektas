
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
public class BilietoID {
      static AtomicInteger nextId = new AtomicInteger();
    public UUID id;
    
    public static synchronized String sukurtiID(){
        return String.valueOf(UUID.randomUUID());
        
    }

    public static AtomicInteger getNextId() {
        return nextId;
    }

    public static void setNextId(AtomicInteger nextId) {
        BilietoID.nextId = nextId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
}


