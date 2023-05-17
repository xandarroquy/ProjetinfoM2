/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fr.insa.darroquy.devisbatiment;

/**
 *
 * @author xdarroquy01
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class Devisbatiment extends Application /*throws IOException*/ {
    
   
   public static ArrayList<Appartement> listeAppartement = new ArrayList<>();
   public static double [] Prix_pieces = new double [10];
   public static double [] Prix_appartements = new double [10];
   public static int l, w;
   public static ArrayList<Piece> listePiece = new ArrayList<>();
   public static ArrayList<Mur> listeMur= new ArrayList<>(); 
   public static ArrayList<Coin> listeCoin= new ArrayList<>();

   
           public static ArrayList<Mur> getListemur (){
            return listeMur ;
        }
           public static ArrayList<Piece> getListepiece (){
            return listePiece ;
        }
           public static ArrayList<Coin> getListecoin (){
            return listeCoin ;
        }
   @Override
   public void start(Stage primaryStage) throws IOException{
       
        FileWriter fileWriter = new FileWriter("DevisBatiment.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
       
        
        TextInputDialog dialog;
        dialog = new TextInputDialog();
        
        dialog.setTitle("Nombre d'appartements");
        dialog.setHeaderText("Definissez le nombre d'appartements");
        dialog.setContentText("Combien voulez-vous d'appartements dans votre immeuble ?");
        Optional<String> nbr_appart = dialog.showAndWait();
        double valeur = Double.parseDouble(nbr_appart.get());
        for(int u = 1; u<= valeur; u++){
        
        
        dialog.setTitle("Nombre de pièces");
        dialog.setHeaderText("Definissez le nombre de pièces");
        dialog.setContentText("Combien voulez-vous de pièces dans votre appartement ?");
        Optional<String> nbr_p = dialog.showAndWait();
        valeur = Double.parseDouble(nbr_p.get());
        for (int k = 1; k<= valeur; k++){
       
            
        Coin c1;
        dialog.setTitle("Identifiant du coin");
        dialog.setHeaderText("Definissez l'identifiant du coin");
        dialog.setContentText("Quel est l'identifiant du coin");
        Optional<String> IDc1 = dialog.showAndWait();
        double id = Double.parseDouble(IDc1.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'abscisse du coin");
        dialog.setContentText("Quelle est l'abscisse du coin");
        Optional<String> xc1 = dialog.showAndWait();
        double x = Double.parseDouble(xc1.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'ordonnée du coin");
        dialog.setContentText("Quel est l'ordonnée du coin");
        Optional<String> yc1 = dialog.showAndWait();
        double y = Double.parseDouble(yc1.get());
   
        c1=new Coin(id,x,y);
        c1.afficher();
                
        Coin c2;
        dialog.setTitle("Identifiant du coin");
        dialog.setHeaderText("Definissez l'identifiant du coin");
        dialog.setContentText("Quel est l'identifiant du coin");
        Optional<String> IDc2 = dialog.showAndWait();
        id = Double.parseDouble(IDc2.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'abscisse du coin");
        dialog.setContentText("Quelle est l'abscisse du coin");
        Optional<String> xc2 = dialog.showAndWait();
        x = Double.parseDouble(xc2.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'ordonnée du coin");
        dialog.setContentText("Quel est l'ordonnée du coin");
        Optional<String> yc2 = dialog.showAndWait();
        y = Double.parseDouble(yc2.get());
        
        c2=new Coin(id,x,y);
        c2.afficher();
        
         
        Coin c3;
        dialog.setTitle("Identifiant du coin");
        dialog.setHeaderText("Definissez l'identifiant du coin");
        dialog.setContentText("Quel est l'identifiant du coin");
        Optional<String> ID3 = dialog.showAndWait();
        id = Double.parseDouble(ID3.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'abscisse du coin");
        dialog.setContentText("Quelle est l'abscisse du coin");
        Optional<String> xc3 = dialog.showAndWait();
        x = Double.parseDouble(xc3.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'ordonnée du coin");
        dialog.setContentText("Quel est l'ordonnée du coin");
        Optional<String> yc3 = dialog.showAndWait();
        y = Double.parseDouble(yc3.get());
        
        c3=new Coin(id,x,y);
        c3.afficher();
         
        Coin c4;
        dialog.setTitle("Identifiant du coin");
        dialog.setHeaderText("Definissez l'identifiant du coin");
        dialog.setContentText("Quel est l'identifiant du coin");
        Optional<String> IDc4 = dialog.showAndWait();
        id = Double.parseDouble(IDc4.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'abscisse du coin");
        dialog.setContentText("Quelle est l'abscisse du coin");
        Optional<String> xc4 = dialog.showAndWait();
        x = Double.parseDouble(xc4.get());
        
        dialog.setTitle("Coordonnées du coin");
        dialog.setHeaderText("Definissez l'ordonnée du coin");
        dialog.setContentText("Quel est l'ordonnée du coin");
        Optional<String> yc4 = dialog.showAndWait();
        y = Double.parseDouble(yc4.get());
        
        c4=new Coin(id,x,y);
        c4.afficher();
         
         listeCoin.add(c1);
         listeCoin.add(c2);
         listeCoin.add(c3);
         listeCoin.add(c4);
         
         
         
         
         System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
         int nbrf = Lire.i();
         System.out.println("Et combien voulez vous de portes ?");
         int nbrp = Lire.i();
         double lpf = nbrp*0.9+nbrf*1.2;
         
         
         
        double prix_m = 0;
         Lecture(1,0,0);
         System.out.println("Combien voulez vous de revetements ?");
         int nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);
             
         }
         
         
         Mur m1;
         System.out.println(" Identifiant du Mur");
         id=Lire.i();
         m1=new Mur(id,c1,c2, nbrp, nbrf);
         m1.afficher();
//         System.out.println(c2.toString());
//         System.out.println(m1.toString());
         System.out.println("Longueur du mur ="+m1.longueur());
         //Formattage de l'affichage
         System.out.format("\nLongueur du mur =%.2f",m1.longueur());
         System.out.println("                ");
         while (lpf>m1.longueur()){
             System.out.println("La longueur disponible n'est pas suffisante");
             System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
             nbrf = Lire.i();
             System.out.println("Et combien voulez vous de portes ?");
             nbrp = Lire.i();
             lpf = nbrp*0.9+nbrf*1.2;
             
         }
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());
         double prix_m1 =  m1.surface(nbrp, nbrf)*prix_m;
         System.out.println("Le prix de ce mur est :" + prix_m1 + " euros");
         
        System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
         nbrf = Lire.i();
         System.out.println("Et combien voulez vous de portes ?");
         nbrp = Lire.i();
         lpf = nbrp*0.9+nbrf*1.2;
         
         prix_m = 0;
         Lecture(1,0,0);
         System.out.println("Combien voulez vous de revetements ?");
         nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);
             
         } 
         Mur m2;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m2=new Mur(id, c2, c3, nbrp, nbrf);
         m2.afficher();
         System.out.println("Longueur du mur="+m2.longueur());
         System.out.format("\nLongueur du mur =%.2f", m2.longueur());
         System.out.println("                ");
         while (lpf>m2.longueur()){
             System.out.println("La longueur disponible n'est pas suffisante");
             System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
             nbrf = Lire.i();
             System.out.println("Et combien voulez vous de portes ?");
             nbrp = Lire.i();
             lpf = nbrp*0.9+nbrf*1.2;
             
         }
         double prix_m2 =  m2.surface(nbrp, nbrf)*prix_m;
         System.out.println("Le prix de ce mur est :" + prix_m2 + " euros");
         
        System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
         nbrf = Lire.i();
         System.out.println("Et combien voulez vous de portes ?");
         nbrp = Lire.i();
         lpf = nbrp*0.9+nbrf*1.2;
         
        prix_m = 0;
         Lecture(1,0,0);
         System.out.println("Combien voulez vous de revetements ?");
         nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);
             
         }
         Mur m3;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m3=new Mur(id, c3, c4, nbrp, nbrf);
         m3.afficher();
         System.out.println("Longueur du mur="+m3.longueur());
         System.out.format("\nLongueur du mur =%.2f", m3.longueur());
         System.out.println("                ");
         while (lpf>m3.longueur()){
             System.out.println("La longueur disponible n'est pas suffisante");
             System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
             nbrf = Lire.i();
             System.out.println("Et combien voulez vous de portes ?");
             nbrp = Lire.i();
             lpf = nbrp*0.9+nbrf*1.2;
             
         }
         double prix_m3 =  m3.surface(nbrp, nbrf)*prix_m;
         System.out.println("Le prix de ce mur est :" + prix_m3 + " euros");
         
         System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
         nbrf = Lire.i();
         System.out.println("Et combien voulez vous de portes ?");
         nbrp = Lire.i();
         lpf = nbrp*0.9+nbrf*1.2;
         
        prix_m = 0;
         Lecture(1,0,0);
         System.out.println("Combien voulez vous de revetements ?");
         nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);
             
         }
         Mur m4;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m4=new Mur(id, c4, c1, nbrp, nbrf);
         m4.afficher();
         System.out.println("Longueur du mur="+m4.longueur());
         System.out.format("\nLongueur du mur =%.2f", m4.longueur());
         System.out.println("                ");
         while (lpf>m4.longueur()){
             System.out.println("La longueur disponible n'est pas suffisante");
             System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
             nbrf = Lire.i();
             System.out.println("Et combien voulez vous de portes ?");
             nbrp = Lire.i();
             lpf = nbrp*0.9+nbrf*1.2;
             
         }
         double prix_m4 =  m4.surface(nbrp, nbrf)*prix_m;
         System.out.println("Le prix de ce mur est :" + prix_m4 + " euros");
        
         
         listeMur.add(m1);
         listeMur.add(m2);
         listeMur.add(m3);
         listeMur.add(m4);
         
         
         ArrayList<Revetements> listeRevetements = new ArrayList<>();
         
         prix_m = 0;
         Lecture(0,0,1);
         System.out.println("Pour ce plafond, combien voulez vous de revetements ?");
         nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);
             
         }
    
         Plafond pl1;
         double str = 0;
         System.out .println("Identifiant du plafond");
         id = Lire.i();
         System.out.println("Voulez vous mettre une trémie ?(oui = 1, non = 0)");
         int r = Lire.i();
         if ( r==1 ){
            str = 1.44;
         }
         else{
             str = 0;
         }
         pl1=new Plafond (id, listeMur, listeRevetements, str);
         double prix_pl1 =  pl1.surface(str)*prix_m;
         System.out.println("Le prix de ce plafond est :" + prix_pl1 + " euros");
        
         ArrayList<Plafond> listePlafond = new ArrayList<>();
         listePlafond.add(pl1);
         
         
         prix_m = 0;
         Lecture(0,1,0);
         System.out.println("Pour ce sol, combien voulez vous de revetements ?");
         nbrev = Lire.i();
         for (int z=1; z<nbrev+1; z++){
             System.out.println("Donnez le numéro du revêtement souhaité ?");
             int num = Lire.i();
             prix_m = prix_m + Lecture_bis(num);}
        
             
         Sol s1;
         System.out.println("Identifiant du Sol");
         id = Lire.i();
         s1 = new Sol (id, listeMur, listeRevetements);
         double prix_s1 =  s1.surface()*prix_m;
         System.out.println("Le prix de ce sol est :" + prix_s1 + " euros");
         ArrayList<Sol> listeSol = new ArrayList<>();
         listeSol.add(s1);
         
        
         Piece p1;
         System.out.println("Identifiant de la pièce");
         id=Lire.i();
         p1=new Piece(id, pl1, s1, listeMur );
         double prix_piece = prix_m1 + prix_m2 + prix_m3 + prix_m4 + prix_s1 + prix_pl1;
         System.out.println("Le prix de la piece est de :" + prix_piece);
         listePiece.add(p1);
         Prix_pieces[l] = prix_piece;
         l = l + 1;
         
         for (Coin c : listeCoin){
             bufferedWriter.write("Coin:"+c.idCoin + ";" + c.cx + ";" + c.cy + ";");
             bufferedWriter.newLine();
         }
         
         for (Mur m : listeMur){
             bufferedWriter.write("Mur:"+m.idMur + ";" + m.debut + ";" + m.fin + ";");
             bufferedWriter.newLine();
         }
         for (Plafond p : listePlafond){
             bufferedWriter.write("Plafond:"+p.idPlafond + ";" );
             bufferedWriter.newLine();
         }
         for (Sol s : listeSol){
             bufferedWriter.write("Sol:"+s.idSol + ";" );
             bufferedWriter.newLine();
         }
         for (Piece p : listePiece){
             bufferedWriter.write("Piece:"+p.idPiece + ";");
             bufferedWriter.newLine();
         }
        }
        Appartement Appart1;
        System.out.println("Identifiant de l'appartement");
        int id = Lire.i();
        Appart1 = new Appartement(id, listePiece);
        listeAppartement.add(Appart1);
        double prix_appart = 0;
        for (int j=0; j<Prix_pieces.length; j++){
            prix_appart = Prix_pieces[j] + prix_appart;
            
        }
        Prix_appartements[w] = prix_appart;
        w = w + 1;
        
        
        for (Appartement a : listeAppartement){
             bufferedWriter.write("Appartement: "+a.idAppart + ";");
             bufferedWriter.newLine();
        }
        }
        Immeuble Immeuble1;
        System.out.println("Identifiant de l'immeuble");
        int id = Lire.i();
        Immeuble1 = new Immeuble(id, listeAppartement);
        double prix_immeuble = 0;
        for (int v=0; v<Prix_appartements.length; v++ ){
            prix_immeuble = Prix_appartements[v] + prix_immeuble;
        }
        System.out.println("L'immeuble coûte au total " + prix_immeuble);
        
        bufferedWriter.flush();
        bufferedWriter.close();
        
        primaryStage.setScene(new Scene(new Interface(listeCoin,listeMur,listePiece)));
        primaryStage.setMaximized(true);
        primaryStage.show();
        
    }

    public static void main (String[]args){
        launch(args);
    }

    public static void Lecture (int m, int a, int b){
        System.out.println("Revêtements disponibles :");
        try
        {
        BufferedReader Catalogue_revetements=new BufferedReader(new FileReader("Catalogue_revetements.txt"));
        String ligne = Catalogue_revetements.readLine();// Ligne lue depuis le fichier
        while(ligne!=null)
        {
            String[] listRev = ligne.split(";");
            ligne = Catalogue_revetements.readLine();    
            if (listRev[2].equals(String.valueOf(m))&&(listRev[2].equals("1"))){
                System.out.println(listRev[1] + "numero" + listRev[0] + ". Prix : " + listRev[5]);
            }
            if (listRev[3].equals(String.valueOf(a))&&(listRev[3].equals("1"))){
                System.out.println(listRev[1] + "numero" + listRev[0] + ". Prix : " + listRev[5]);
            }
            if (listRev[4].equals(String.valueOf(b))&&(listRev[4].equals("1"))){
                System.out.println(listRev[1] + "numero" + listRev[0] + ". Prix : " + listRev[5]);
                }
        }}
        catch(FileNotFoundException err){
        System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
        catch (IOException err){
        System.out.println(" Erreur :\n "+err);}}
    

        
        
        
        public static double Lecture_bis(int num){
            try
        {
        BufferedReader Catalogue_revetements=new BufferedReader(new FileReader("Catalogue_revetements.txt"));
        String ligne = Catalogue_revetements.readLine();// Ligne lue depuis le fichier
        while(ligne!=null)
        {
            String[] listRev = ligne.split(";");
            ligne = Catalogue_revetements.readLine();    
            if(listRev[0].equals(String.valueOf(num))){
                return Double.parseDouble(listRev[5]);
            }
        }}
        catch(FileNotFoundException err){
        System.out.println( "Erreur :le fichier n’existe pas!\n "+err);}
        catch (IOException err){
        System.out.println(" Erreur :\n "+err);}
            return(0);
                    
        }
        

}