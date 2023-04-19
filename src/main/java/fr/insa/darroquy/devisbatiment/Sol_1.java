/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Morgane
 */
import java.util.ArrayList;
import java.util.List;

public class Sol_1 {
    private int IdSol;
    private List<Coin> listeCoins;
    private List<Mur> listeMurs;
    private List<Revetement> listeRevetements;

    public Sol_1(int IdSol) {
        this.IdSol = IdSol;
        this.listeCoins = new ArrayList<>();
        this.listeMurs = new ArrayList<>();
        this.listeRevetements = new ArrayList<>();
    }

    public void addCoin(Coin coin) {
        listeCoins.add(coin);
    }

    public void addMur(Mur mur) {
        listeMurs.add(mur);
    }

    public void addRevetement(Revetement revetement) {
        listeRevetements.add(revetement);
    }

    public void afficher() {
        System.out.println("IdSol : " + IdSol);
        System.out.println("Coins : ");
        for (Coin coin : listeCoins) {
            coin.afficher();
        }
        System.out.println("Murs : ");
        for (Mur mur : listeMurs) {
            mur.afficher();
        }
        System.out.println("Revetements : ");
        for (Revetement revetement : listeRevetements) {
            revetement.afficher();
        }
        System.out.println("Surface totale : " + surface());
    }

    @Override
    public String toString() {
        return "Sol{" +
                "IdSol=" + IdSol +
                ", listeCoins=" + listeCoins +
                ", listeMurs=" + listeMurs +
                ", listeRevetements=" + listeRevetements +
                '}';
    }

    public double surface() {
        double surfaceTotale = 0;
        for (Mur mur : listeMurs) {
            surfaceTotale += mur.surface();
        }
        return surfaceTotale;
    }
}

