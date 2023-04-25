/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xdarroquy01
 */
public class Plafond {
    int idPlafond;
    ArrayList<Coin>listeCoin;
    //ArrayList<Revetements> listeRevetements;
    
    Plafond(int id, ArrayList<Coin>coin, ArrayList<Revetements> revetements )
    {
        this.idPlafond=id;
        this.listeCoin=coin;
        //this.listeRevetements=revetements;
    }
     double longueur()
    {
        return();
    }
     
      double surface()
    {
        System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        double hsp=Lire.d();
        return();
    }
}
