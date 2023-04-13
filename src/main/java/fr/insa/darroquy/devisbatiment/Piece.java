/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author acoirault01
 */
public class Piece {
    int idPiece;
    int Plafond;
    int Sol;
    ArrayList<Mur> listeMur;

    public Piece(int idPiece, int Plafond, int Sol, ArrayList<Mur> listeMur) {
        this.idPiece = idPiece;
        this.Plafond = Plafond;
        this.Sol = Sol;
        this.listeMur = listeMur;
    }
    
    
   }
           
  

   
    
    
    
