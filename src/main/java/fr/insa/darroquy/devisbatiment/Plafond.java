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
    ArrayList<Mur>listeMur;
    ArrayList<Revetements> listeRevetements;
    int nbrtremie;
    
    Plafond(int id, ArrayList<Mur>mur, ArrayList<Revetements> revetements, int nbrt )
    {
        this.idPlafond=id;
        this.listeMur=mur;
        this.listeRevetements=revetements;
        this.nbrtremie=nbrt;
    }
     double longueur()
    {
        double max = listeMur.get(0).longueur();
        for (int i=1; i<=3; i++){
            if (listeMur.get(i).longueur()>listeMur.get(0).longueur()){
                max = listeMur.get(i).longueur();
            }
        }
        return max ;
    }
     
     double largeur()
     {
         double min = listeMur.get(0).longueur();
         for (int i=1; i<=3; i++){
             if (listeMur.get(i).longueur()<listeMur.get(0).longueur()){
                min = listeMur.get(i).longueur();}
         }
        return min ; 
     }
     
             
       double surface(int nbrt)
    {
        
        return(longueur()*largeur()-nbrt);
    }
}
