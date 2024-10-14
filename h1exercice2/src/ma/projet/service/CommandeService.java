/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.List;
import ma.projet.beans.Commande;
import ma.projet.beans.Commande;
import ma.projet.beans.Commande;
import ma.projet.dao.Idao;
import ma.projet.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author OUMAIMA
 */
public class CommandeService implements Idao<Commande>{

     @Override
    public Boolean create(Commande o) {
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
    public Commande getById(int o) {
        Session session = null;
        Commande commande=null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         commande=(Commande)session.get(Commande.class, o);
         
         session.getTransaction().commit();
         return commande;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return commande;
     }

    @Override
    public List<Commande> getAll() {
       Session session = null;
      List <Commande>  commandes =null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         commandes= session.createQuery("FROM commande").list();
         session.getTransaction().commit();
         return commandes;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return commandes;
     }
    
}
