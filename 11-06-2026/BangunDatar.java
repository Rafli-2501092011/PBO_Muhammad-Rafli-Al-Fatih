/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl11_06_26;

/**
 *
 * @author LAB-SI-PC
 */
public class BangunDatar implements Relation {

    private double panjang;
    private double lebar;

    public BangunDatar() {
    }

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getLuas(){
        double luas = panjang * lebar;
        return luas;
    }
    
    @Override
    public boolean isGreater(Object a, Object b) {
        double aLuas = ((BangunDatar) a).getLuas();
        double bLuas = ((BangunDatar) b).getLuas();
        return (aLuas > bLuas);
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double aLuas = ((BangunDatar) a).getLuas();
        double bLuas = ((BangunDatar) b).getLuas();
        return (aLuas < bLuas);
        
    }

    @Override
    public boolean isEqual(Object a, Object b) {
        double aLuas = ((BangunDatar) a).getLuas();
        double bLuas = ((BangunDatar) b).getLuas();
        return (aLuas == bLuas);
    }

}
