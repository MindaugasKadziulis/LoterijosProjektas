/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Bilietas {
   
    private int bilietoNumeris;
    private int[] loterijosSkaiciuSeka;
    
    public Bilietas (int bilietoNumeris, int loterijosSkaiciuSeka){
        this.bilietoNumeris = bilietoNumeris;
        this.loterijosSkaiciuSeka = this.loterijosSkaiciuSeka;
    }

    public int getBilietoNumeris() {
        return bilietoNumeris;
    }

    public void setBilietoNumeris(int bilietoNumeris) {
        this.bilietoNumeris = bilietoNumeris;
    }

    public int[] getLoterijosSkaiciuSeka() {
        return loterijosSkaiciuSeka;
    }

    public void setLoterijosSkaiciuSeka(int[] loterijosSkaiciuSeka) {
        this.loterijosSkaiciuSeka = loterijosSkaiciuSeka;
    }
    
}
