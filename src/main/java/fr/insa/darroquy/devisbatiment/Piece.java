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
    Plafond plafond;
    Sol sol;
    ArrayList<Mur> listeMur;

    public Piece(int idPiece, Plafond plafond, Sol sol, ArrayList<Mur> listeMur) {
        this.idPiece = idPiece;
        this.plafond = plafond;
        this.sol = sol;
        this.listeMur = listeMur;
      
    }
    
    void afficher() {
        System.out.println("Piece : id = "+ this.idPiece + ", sol = " + this.sol +", plafond = " + this.plafond);
    }
    
   }
           
  

   
    
    
    
