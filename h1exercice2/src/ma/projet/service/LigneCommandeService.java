/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.LinkedList;
import java.util.List;
import ma.projet.beans.Commande;
import ma.projet.beans.LigneCommandeProduit;
import ma.projet.beans.LigneCommandeProduit;
import ma.projet.beans.Produit;
import ma.projet.dao.Idao;
import ma.projet.util.NewHibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author OUMAIMA
 */
public class LigneCommandeService  implements Idao<LigneCommandeProduit>{

    @Override
    public Boolean create(LigneCommandeProduit o) {
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
    public LigneCommandeProduit getById(int o) {
        Session session = null;
        LigneCommandeProduit ligneCommandeProduit=null;
        
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         ligneCommandeProduit=(LigneCommandeProduit)session.get(LigneCommandeProduit.class, o);
         
         session.getTransaction().commit();
         return ligneCommandeProduit;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return ligneCommandeProduit;
     }

    @Override
    public List<LigneCommandeProduit> getAll() {
       Session session = null;
      List <LigneCommandeProduit>  ligneCommandeProduits =null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         ligneCommandeProduits= session.createQuery("FROM ligneCommandeProduit").list();
         session.getTransaction().commit();
         return ligneCommandeProduits;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return ligneCommandeProduits;
     }
    public void getLigne(int id) {
           List <LigneCommandeProduit> a=null;
        CommandeService ss=new CommandeService();
        Commande c =ss.getById(id);
           a =c.getProduits();
         System.out.println("commande "+id+ "             "+ c.getDate());  
         System.out.println("  prix "+  "       "+      " reference "+  "     "+" quantite ");
         for (LigneCommandeProduit ex : a) {
             System.out.println( ex.getProduit().getPrix()   + "            "+  ex.getProduit().getReference() +"            "+ex.getQuantite()+"DH");
      
        }
         }
   
    }
   
     
         
       
             
          
         
         
      
        
    
    
