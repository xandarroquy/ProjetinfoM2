/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Morgane
 */
public class Revetement_1 {
    private int IdRevetement;
    private boolean designation;
    private boolean pourMur;
    private boolean pourSol;
    private boolean pourPlafond;
    private double prixUnitaire;

    public Revetement_1(int IdRevetement, boolean designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double prixUnitaire) {
        this.IdRevetement = IdRevetement;
        this.designation = designation;
        this.pourMur = pourMur;
        this.pourSol = pourSol;
        this.pourPlafond = pourPlafond;
        this.prixUnitaire = prixUnitaire;
    }

    public void afficher() {
        System.out.println("IdRevetement : " + IdRevetement);
        System.out.println("Designation : " + designation);
        System.out.println("PourMur : " + pourMur);
        System.out.println("PourSol : " + pourSol);
        System.out.println("PourPlafond : " + pourPlafond);
        System.out.println("Prix unitaire : " + prixUnitaire);
    }

    @Override
    public String toString() {
        return "Revetement{" +
                "IdRevetement=" + IdRevetement +
                ", designation=" + designation +
                ", pourMur=" + pourMur +
                ", pourSol=" + pourSol +
                ", pourPlafond=" + pourPlafond +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }

    public double surface(Mur mur) {
        return mur.longueur() * mur.hauteur();
    }

    public double cout(Mur mur) {
        return surface(mur) * prixUnitaire;
    }
}


