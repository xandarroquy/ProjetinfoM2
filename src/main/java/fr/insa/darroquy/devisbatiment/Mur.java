/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

import java.util.Optional;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    double idMur;
    Coin debut, fin;
    double nbrporte;
    double nbrfenetre;
    
    
    
    
    Mur(double id, Coin dc, Coin fc, double nbrp, double nbrf)
    {
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.nbrporte=nbrp;
        this.nbrfenetre=nbrf;
        
    }
    
    public Coin getDC(){
        return debut;
    }
    public Coin getFC(){
        return fin;
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    double longueur()
    {
        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
    }
    
    double surface(double nbrp, double nbrf)
    {
        TextInputDialog dialog;
        dialog = new TextInputDialog();
        
        dialog.setTitle("Hauteur sous-plafond");
         dialog.setHeaderText("Definissez la hauteur sous-plafond");
         dialog.setContentText("Quelle est la hauteur sous-plafond ?");
         Optional<String> h = dialog.showAndWait();
         double hsp = Double.parseDouble(h.get());
        while (hsp<2.1){
            dialog.setTitle("Hauteur sous-plafond");
            dialog.setHeaderText("La hauteur sous plafond est trop basse !");
            dialog.setContentText("Quelle est la nouvelle hauteur sous-plafond ?");
            Optional<String> h_2 = dialog.showAndWait();
            hsp = Double.parseDouble(h_2.get());
        }
        return(this.longueur()*hsp-(nbrp*1.89+1.44*nbrf));
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + '}';
    }
    
}
