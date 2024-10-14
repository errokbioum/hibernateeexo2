/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.List;
import ma.projet.beans.Categorie;
import ma.projet.dao.Idao;
import ma.projet.util.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author OUMAIMA
 */
public class CategorieService implements Idao<Categorie>{

    @Override
    public Boolean create(Categorie o) {
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
    public Categorie getById(int o) {
        Session session = null;
        Categorie categorie=null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         categorie=(Categorie)session.get(Categorie.class, o);
         
         session.getTransaction().commit();
         return categorie;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return categorie;
     }

    @Override
    public List<Categorie> getAll() {
       Session session = null;
      List <Categorie>  categories =null;
     try {
         session=NewHibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         categories= session.createQuery("FROM categorie").list();
         session.getTransaction().commit();
         return categories;
         
     }catch (HibernateException e ) {
         session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return categories;
     }
    
    
    
    
    }
    

  
   
    

  

