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
public class Devisbatiment {
    
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
        
    

    public static void main(String[] args) throws IOException {
        
        FileWriter fileWriter = new FileWriter("DevisBatiment.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        
        Coin c1;
        System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin");
        double y=Lire.d();
        c1=new Coin(id,x,y);
        // Pour afficher textuellement le coin c1
        c1.afficher();
                
         Coin c2;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         c2=new Coin(id,x,y);
         
         Coin c3;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         c3=new Coin(id,x,y);
         
         Coin c4;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         c4=new Coin(id,x,y);
         
         ArrayList<Coin> listeCoin = new ArrayList<>();
         listeCoin.add(c1);
         listeCoin.add(c2);
         listeCoin.add(c3);
         listeCoin.add(c4);
         
         for (Coin c : listeCoin){
             bufferedWriter.write(c.idCoin + ";" + c.cx + ";" + c.cy + ";");
             bufferedWriter.newLine();
         }
         
         System.out.println("Pour ce mur, combien voulez vous de fenetres ?");
         int nbrf = Lire.i();
         System.out.println("Et combien voulez vous de portes ?");
         int nbrp = Lire.i();
         
         Lecture(1,0,0);
         System.out.println("combien voulez vous de revetements ?");
         int num = Lire.i();
         Lecture_bis(num);
         
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
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());

         System.out.format(m1.toString()+"\nSurface :%.2f",m1.surface(nbrp, nbrf));
         
         Mur m2;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m2=new Mur(id, c2, c3, nbrp, nbrf);
         m2.afficher();
         System.out.println("Longueur du mur="+m2.longueur());
         System.out.format("\nLongueur du mur =%.2f", m2.longueur());
         System.out.format(m2.toString()+"\nSurface :%.2f",m2.surface(nbrp, nbrf));
         
         Mur m3;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m3=new Mur(id, c3, c4, nbrp, nbrf);
         m3.afficher();
         System.out.println("Longueur du mur="+m3.longueur());
         System.out.format("\nLongueur du mur =%.2f", m3.longueur());
         System.out.format(m3.toString()+"\nSurface :%.2f",m3.surface(nbrp, nbrf));
         
         Mur m4;
         System.out.println("Identifiant du Mur");
         id=Lire.i();
         m4=new Mur(id, c4, c1, nbrp, nbrf);
         m4.afficher();
         System.out.println("Longueur du mur="+m4.longueur());
         System.out.format("\nLongueur du mur =%.2f", m4.longueur());
         System.out.format(m4.toString()+"\nSurface :%.2f",m4.surface(nbrp, nbrf));
        
         ArrayList<Mur> listeMur = new ArrayList<>();
         listeMur.add(m1);
         listeMur.add(m2);
         listeMur.add(m3);
         listeMur.add(m4);
         
         for (Mur m : listeMur){
             bufferedWriter.write(m.idMur + ";" + m.debut + ";" + m.fin + ";");
             bufferedWriter.newLine();
         }
         
         ArrayList<Revetements> listeRevetements = new ArrayList<>();
    
         Plafond pl1;
         System.out .println("Identifiant du plafond");
         id = Lire.i();
         pl1=new Plafond (id, listeMur, listeRevetements );
         
         
         Sol s1;
         System.out.println("Identifiant du Sol");
         id = Lire.i();
         s1 = new Sol (id, listeMur, listeRevetements);
         
         
         Piece p1;
         System.out.println("Identifiant de la pièce");
         id=Lire.i();
         p1=new Piece(id, pl1, s1, listeMur );
         
         bufferedWriter.flush();
         bufferedWriter.close();
         
        
    }
}
