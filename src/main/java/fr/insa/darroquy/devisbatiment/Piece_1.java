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

public class Piece_1 {
    private int idPiece;
    private Sol sol;
    private Plafond plafond;
    private List<Mur> listeMurs;

    public Piece_1(int idPiece, Sol sol, Plafond plafond, List<Mur> listeMurs) {
        this.idPiece = idPiece;
        this.sol = sol;
        this.plafond = plafond;
        this.listeMurs = listeMurs;
    }

    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public Sol getSol() {
        return sol;
    }

    public void setSol(Sol sol) {
        this.sol = sol;
    }

    public Plafond getPlafond() {
        return plafond;
    }

    public void setPlafond(Plafond plafond) {
        this.plafond = plafond;
    }

    public List<Mur> getListeMurs() {
        return listeMurs;
    }

    public void setListeMurs(List<Mur> listeMurs) {
        this.listeMurs = listeMurs;
    }

    public void afficher() {
        System.out.println("Pièce " + idPiece + " :");
        System.out.println("   Sol : " + sol);
        System.out.println("   Plafond : " + plafond);
        System.out.println("   Liste des murs :");
        for (Mur mur : listeMurs) {
            System.out.println("      " + mur);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pièce ").append(idPiece).append(" :\n");
        sb.append("   Sol : ").append(sol).append("\n");
        sb.append("   Plafond : ").append(plafond).append("\n");
        sb.append("   Liste des murs :\n");
        for (Mur mur : listeMurs) {
            sb.append("      ").append(mur).append("\n");
        }
        return sb.toString();
    }

    public double surface() {
        double surface = sol.surface();
        for (Mur mur : listeMurs) {
            surface += mur.surface();
        }
        surface += plafond.surface();
        return surface;
    }
}

