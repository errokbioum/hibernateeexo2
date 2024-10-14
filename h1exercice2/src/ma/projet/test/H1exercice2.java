/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;


import java.util.Date;
import java.util.List;
import ma.projet.beans.Categorie;
import ma.projet.beans.Commande;
import ma.projet.beans.LigneCommandeProduit;
import ma.projet.beans.Produit;
import ma.projet.beans.ProduitCommandePk;
import ma.projet.service.CategorieService;
import ma.projet.service.CommandeService;
import ma.projet.service.LigneCommandeService;
import ma.projet.service.ProduitService;
import ma.projet.util.NewHibernateUtil;

/**
 *
 * @author OUMAIMA
 */
public class H1exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewHibernateUtil.getSessionFactory();
        ProduitService pp = new ProduitService();
        CategorieService ss =new CategorieService();
        CommandeService cc= new CommandeService();
        LigneCommandeService ll= new LigneCommandeService();
           Categorie p4= new Categorie("AA", "B09");
            Categorie p5= new Categorie("BB", "A130");
             Categorie p6= new Categorie("CC", "A20");
             ss.create(p6);
             ss.create(p5);
             ss.create(p4);
             Produit c1= new Produit("Aliment ", 10, p6);
             Produit c2=new Produit("vestiment", 2000, p6);
             Produit c3 = new Produit ("skincare",60,p5);
             Produit c4 = new Produit("sport", 200, p5);
              Produit c5= new Produit("Aliment ", 1900, p6);
             Produit c6=new Produit("vestiment", 2000, p6);
             Produit c7 = new Produit ("skincare",1000,p5);
             Produit c8 = new Produit("sport", 200, p4);
             pp.create(c8);
             pp.create(c7);
              pp.create(c6);
             pp.create(c5);
              pp.create(c4);
             pp.create(c3);
              pp.create(c2);
             pp.create(c1);
         Commande d1 = new Commande(new Date());
         Commande d2= new Commande(new Date());
         Commande d3 = new Commande(new Date());
         Commande d4 = new Commande(new Date());
         Commande d5= new Commande(new Date());
         Commande d6 = new Commande(new Date());
         cc.create(d1);
         cc.create(d2);
         cc.create(d3);
         cc.create(d4);
         cc.create(d5);
         cc.create(d6);
        ProduitCommandePk pn= new ProduitCommandePk(1, 3);
        ProduitCommandePk pi= new ProduitCommandePk(1, 2);
        ProduitCommandePk pa= new ProduitCommandePk(2, 3);
        ProduitCommandePk pb= new ProduitCommandePk(3, 5);
        ProduitCommandePk pc= new ProduitCommandePk(4, 1);
        ProduitCommandePk pd= new ProduitCommandePk(5, 2);
        LigneCommandeProduit l1 = new LigneCommandeProduit(pi, c7, d1, 3000);
        LigneCommandeProduit l2 = new LigneCommandeProduit(pa, c6, d2, 9000);
        LigneCommandeProduit l3 = new LigneCommandeProduit(pb, c4, d3, 1900);
        LigneCommandeProduit l4 = new LigneCommandeProduit(pc, c8, d4, 300);
        LigneCommandeProduit l6 = new LigneCommandeProduit(pn, c6, d3, 900);
        ll.create(l1);
         ll.create(l2);
          ll.create(l3);
           ll.create(l4);
              ll.create(l6);
              pp.listM(1);
              pp.getPrixProd();
               ll.getLigne(1);
          
        }
           }
     
          
        
        
        
         
        
         
        
            
        
            
             
        
           
            
        
           
             
             
                     
                    
                    
                     
             
        
    
    

