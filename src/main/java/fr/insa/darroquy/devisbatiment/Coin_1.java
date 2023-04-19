/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Morgane
 */
public class Coin_1 {
    private int IdCoin;
    private double Cx;
    private double Cy;

    public Coin_1(int IdCoin, double Cx, double Cy) {
        this.IdCoin = IdCoin;
        this.Cx = Cx;
        this.Cy = Cy;
    }

    public int getIdCoin() {
        return IdCoin;
    }

    public double getCx() {
        return Cx;
    }

    public double getCy() {
        return Cy;
    }

    public void afficher() {
        System.out.println("IdCoin : " + IdCoin);
        System.out.println("Cx : " + Cx);
        System.out.println("Cy : " + Cy);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "IdCoin=" + IdCoin +
                ", Cx=" + Cx +
                ", Cy=" + Cy +
                '}';
    }
}


