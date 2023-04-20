/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Morgane
 */
import java.util.List;

import java.util.List;

public class Plafond_1 {
    private int idPlafond;
    private List<Coin> listeCoins;
    private List<Revetement> listeRevetements;

    public Plafond_1(int idPlafond, List<Coin> listeCoins, List<Revetement> listeRevetements) {
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.listeRevetements = listeRevetements;
    }

    public int getIdPlafond() {
        return idPlafond;
    }

    public void setIdPlafond(int idPlafond) {
        this.idPlafond = idPlafond;
    }

    public List<Coin> getListeCoins() {
        return listeCoins;
    }

    public void setListeCoins(List<Coin> listeCoins) {
        this.listeCoins = listeCoins;
    }

    public List<Revetement> getListeRevetements() {
        return listeRevetements;
    }

    public void setListeRevetements(List<Revetement> listeRevetements) {
        this.listeRevetements = listeRevetements;
    }

    public double surface() {
        double aire = 0.0;
        for (int i = 0; i < listeCoins.size(); i++) {
            Coin coin1 = listeCoins.get(i);
            Coin coin2 = listeCoins.get((i + 1) % listeCoins.size());
            aire += (coin1.getCx() * coin2.getCy() - coin2.getCx() * coin1.getCy());
        }
        return Math.abs(aire / 2.0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plafond n°").append(idPlafond).append(" :");
        sb.append("\nListe des coins :");
        for (Coin coin : listeCoins) {
            sb.append("\n").append(coin.toString());
        }
        sb.append("\nListe des revêtements :");
        for (Revetement revetement : listeRevetements) {
            sb.append("\n").append(revetement.toString());
        }
        sb.append("\nSurface : ").append(surface());
        return sb.toString();
    }
}

