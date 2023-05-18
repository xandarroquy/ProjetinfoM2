/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author Morgane
 */
public class Immeuble {
    
    double idImmeuble;
    ArrayList<Appartement> listeAppartement;

    public Immeuble(double idImmeuble, ArrayList<Appartement> listeAppartement) {
        this.idImmeuble = idImmeuble;
        this.listeAppartement = listeAppartement;
    }

  
    
}
