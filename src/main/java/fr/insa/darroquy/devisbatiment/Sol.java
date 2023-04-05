/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.coirault.projet_info_s2_2;

import java.util.ArrayList;

/**
 *
 * @author acoirault01
 */
public class Sol {
    int idSol;
    ArrayList<Revetements> listeRevetements;
    ArrayList<Coin> listeCoin;
    
    
    
Sol(int id, ArrayList<Revetements> revetements, ArrayList<Coin> coin ) {
    this.idSol=id;
    this.listeCoin=coin;
    this.listeRevetements=revetements;
}   
     void afficher()
    {System.out.println("==== Sol =====");
        for (int i=0;i<listeCoin.size();i++)
        {
        this.listeCoin.get(i).afficher();
        }
    }
     
     // toString

    @Override
    public String toString() {
        return "Sol{" + "idSol=" + idSol + ", listeRevetements=" + listeRevetements + ", listeCoin=" + listeCoin + '}';
    }
     
     
}
