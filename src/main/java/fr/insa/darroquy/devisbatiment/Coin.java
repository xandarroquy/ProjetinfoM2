/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author Amadou Coulibaly
 */
public class Coin {
// Bonjour
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coin{");
        sb.append("idCoin=").append(idCoin);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append('}');
        return sb.toString();
    }
    // Attributs
    double idCoin;
    double cx;
    double cy;
    // Constructeur
    Coin(double id, double x, double y)
    {
      this.idCoin=id;
      this.cx=x;
      this.cy=y;
    }
    
    public double getX(){
        return cx;
    }
    public double getY(){
        return cy;
    }
    
    void afficher()
    {
        System.out.println(" Coin : id ="+this.idCoin+" abscisse = "+this.cx+ " Ordonnée ="+this.cy);
    }
            
}
