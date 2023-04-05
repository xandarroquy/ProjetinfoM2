/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.coirault.projet_info_s2_2;

/**
 *
 * @author acoirault01
 */
public class Revetements {
    int idRevetements;
    String designation;
    int pourMur;
    int pourSol;
    int pourPlafond;
    double prixUnitaire;

    public Revetements(int idRevetements, String designation, int pourMur, int pourSol, int pourPlafond, double prixUnitaire) {
        this.idRevetements = idRevetements;
        this.designation = designation;
        this.pourMur = pourMur;
        this.pourSol = pourSol;
        this.pourPlafond = pourPlafond;
        this.prixUnitaire = prixUnitaire;
    }
    
    
    
}
