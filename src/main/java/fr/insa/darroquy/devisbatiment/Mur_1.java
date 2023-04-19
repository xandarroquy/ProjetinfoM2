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

public class Mur_1 {
    private int IdMur;
    private Coin coinDebut;
    private Coin coinFin;
    private int nbrePortes;
    private int nbreFenetres;
    private List<String> listeRevetements;

    public Mur_1(int IdMur, Coin coinDebut, Coin coinFin, int nbrePortes, int nbreFenetres, List<String> listeRevetements) {
        this.IdMur = IdMur;
        this.coinDebut = coinDebut;
        this.coinFin = coinFin;
        this.nbrePortes = nbrePortes;
        this.nbreFenetres = nbreFenetres;
        this.listeRevetements = listeRevetements;
    }

    public int getIdMur() {
        return IdMur;
    }

    public Coin getCoinDebut() {
        return coinDebut;
    }

    public Coin getCoinFin() {
        return coinFin;
    }

    public int getNbrePortes() {
        return nbrePortes;
    }

    public int getNbreFenetres() {
        return nbreFenetres;
    }

    public List<String> getListeRevetements() {
        return listeRevetements;
    }

    public void afficher() {
        System.out.println("IdMur : " + IdMur);
        System.out.println("Coin de début : " + coinDebut.toString());
        System.out.println("Coin de fin : " + coinFin.toString());
        System.out.println("Nombre de portes : " + nbrePortes);
        System.out.println("Nombre de fenêtres : " + nbreFenetres);
        System.out.println("Liste des revêtements : " + listeRevetements);
    }

    @Override
    public String toString() {
        return "Mur{" +
                "IdMur=" + IdMur +
                ", coinDebut=" + coinDebut +
                ", coinFin=" + coinFin +
                ", nbrePortes=" + nbrePortes +
                ", nbreFenetres=" + nbreFenetres +
                ", listeRevetements=" + listeRevetements +
                '}';
    }

    public double longueur() {
        double dx = coinFin.getCx() - coinDebut.getCx();
        double dy = coinFin.getCy() - coinDebut.getCy();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double surface() {
        double longueurMur = longueur();
        double hauteurMur = 2.5; // hauteur standard d'un mur
        double surfacePorte = 2.2 * 1; // surface standard d'une porte
        double surfaceFenetre = 1.5 * 1; // surface standard d'une fenêtre
        double surfaceOccupee = nbrePortes * surfacePorte + nbreFenetres * surfaceFenetre;
        return longueurMur * hauteurMur - surfaceOccupee;
    }
}
