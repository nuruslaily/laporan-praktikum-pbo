package com.mycompany.praktikum4.inheritance.percobaan3;

/**
 *
 * @author Nurus Laily
 */
public class Tabung1841720049Nurus extends Bangun1841720049Nurus{
    protected int t;
    public void setSuperPhi(double phi){
        super.phi = phi;
    }
    public void setSuperR(int r){
        super.r = r;
    }
    public void setT(int t) {
        this.t = t;
    }
    public void volume(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}
