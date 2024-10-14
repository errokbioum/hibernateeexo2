/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import ma.projet.beans.Categorie;
import ma.projet.beans.Commande;
import ma.projet.beans.LigneCommandeProduit;
import ma.projet.beans.Produit;
import ma.projet.beans.Produit;
import ma.projet.dao.Idao;
import ma.projet.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author OUMAIMA
 */
public class ProduitService implements Idao<Produit> {

   @Override
    public Boolean create(Produit o) {
     Session session = null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         session.save(o);
         session.getTransaction().commit();
         return true;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
     }

    @Override
    public Produit getById(int o) {
        Session session = null;
        Produit produit=null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         produit=(Produit)session.get(Produit.class, o);
         
         session.getTransaction().commit();
         return produit;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return produit;
     }

    @Override
    public List<Produit> getAll() {
       Session session = null;
      List <Produit>  produits =null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         produits= session.createQuery("FROM produit").list();
         session.getTransaction().commit();
         return produits;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return produits;
     }
//   @SuppressWarnings("empty-statement")
//    public List<Produit >listC(int id){
//        Session session = null;
//      List <Produit >  listP =new ArrayList<>();
//       
//     try {
//         session=NewHibernateUtil.getSessionFactory().openSession();
//         session.beginTransaction();
//       
//         listP = session.createQuery("SELECT p FROM Categorie c JOIN c.produits p WHERE c.id = :id").setParameter("id", id).list();
//            System.out.println("-->>>> les produit de la categorie :"+ id + " sont :");
//            for (Produit listP1 : listP) {
//                System.out.println(listP1);
//             
//         }
// 
//         session.getTransaction().commit();
//         return listP;
//    } catch (HibernateException e ) {
//         session.getTransaction().rollback();
//        }finally{
//            session.close();
//        }
//        return listP;
//}
       public List<Produit >listM(int id){
       
      List <Produit >  listP =new ArrayList<>();
       CategorieService ss=new CategorieService();
           Categorie m= ss.getById(id);
            listP=m.getProduits();
            System.out.println("-->>>> les produit de la categorie :"+ id + " sont :");
            for (Produit listP1 : listP) {
                System.out.println(listP1);
         }
            return listP;
                }
           
    public void listDate()  {
        try  {
        LigneCommandeService bb=new LigneCommandeService();
         List<LigneCommandeProduit>prod=null;
         List<LigneCommandeProduit>produ=null;
        
                System.out.println("-->>>>Entrer la premier date dans le format yyyy-MM-dd :");
                    Scanner sc= new Scanner(System.in);
                    String d1=sc.nextLine();
                    System.out.println(" -->>>entrer la deuscieme date dans le format yyyy-MM-dd  :");
                    String d2 =sc.nextLine();      
                 Date debutDate = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
                Date finDate = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
                produ=bb.getAll();
                 System.out.println("-->>la liste des produit ");
                for (LigneCommandeProduit e : produ) {
                    Date dateCommande = e.getCommande().getDate();
            if (!dateCommande.before(debutDate) && !dateCommande.after(finDate)) {
                System.err.println(" id :"+ e.getProduit().getId() +" reference : " + e.getProduit().getReference() +"prix "+  e.getProduit().getPrix() );
            }
        }
      

       
              
             
     } catch (ParseException ex) {
           Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
        
     public void getPrixProd(){
         Session session =null;
         List<Produit>prod=null;
           try {
               session=NewHibernateUtil.getSessionFactory().openSession();
               session.beginTransaction();
              prod=session.createQuery("FROM Produit p WHERE p.prix>100").list();
               System.out.println("les listes des produits superieur a 100 dh sont :");
               for (Produit e : prod) {
                   System.out.println(" id :"+ e.getId() +" reference :"+e.getReference() +"  prix :"+ e.getPrix() );
                   
               }
           }
               
              catch(HibernateException e )  {
         session.getTransaction().rollback();
           
        }finally{
            session.close();
            } 
                
     }
     } 
            
    
     
 

