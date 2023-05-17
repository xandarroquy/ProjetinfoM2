/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.darroquy.devisbatiment;

import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 *
 * @author Morgane
 */
public class Interface extends Pane{
    
    ArrayList<Mur> murs = Devisbatiment.getListemur();
    ArrayList<Coin> coins = Devisbatiment.getListecoin();
    ArrayList<Piece> pieces = Devisbatiment.getListepiece();
    
    
    public Interface(ArrayList<Coin> coins, ArrayList<Mur> murs, ArrayList<Piece> pieces){
        this.coins=coins;
        this.murs=murs;
        this.pieces=pieces;
        redraw();
    }
    
    void redraw (){
        for (Mur mur : murs){
            Line linemur = new Line (mur.getDC().getX(),mur.getDC().getY(),mur.getFC().getX(),mur.getFC().getY());
          getChildren().add(linemur);
        }
        
        for (Coin coin : coins){
            Circle cercle = new Circle(coin.getX(),coin.getY(),5,Color.RED);
            getChildren().add(cercle);
        }
    }
}
