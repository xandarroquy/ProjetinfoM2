/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    double idMur;
    Coin debut, fin;
    int nbrporte;
    int nbrfenetre;
    
    
    
    
    Mur(double id, Coin dc, Coin fc, int nbrp, int nbrf)
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
    
    double surface(int nbrp, int nbrf)
    {
        System.out.println("\nEntrer la Hauteur du mur (hauteur sous-plafond)");
        double hsp=Lire.d();
        while (hsp<2.1){
            System.out.println("La hauteur sous plafond est trop basse !");
            hsp = Lire.d();
        }
        return(this.longueur()*hsp-(nbrp*1.89+1.44*nbrf));
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + '}';
    }
    
}
