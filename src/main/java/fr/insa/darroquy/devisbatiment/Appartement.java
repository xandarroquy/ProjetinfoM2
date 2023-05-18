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
public class Appartement {
    
    double idAppart;
    ArrayList<Piece> listePiece;

    public Appartement(double idAppart, ArrayList<Piece> listePiece) {
        this.idAppart = idAppart;
        this.listePiece = listePiece;
    }
    
    
    
}
