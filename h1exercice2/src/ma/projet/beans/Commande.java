/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author OUMAIMA
 */
@Entity
public class Commande {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Temporal(TemporalType.DATE)
    private Date date ;

   @OneToMany(fetch = FetchType.EAGER,   mappedBy = "commande" )
   List < LigneCommandeProduit> produits=null ;
   
    public Commande(int id) {
        this.id = id;
    }

    public Commande(Date date) {
        this.date = date;
    }
    

    public Commande(int id, Date date, List<LigneCommandeProduit> produits) {
        this.id = id;
        this.date = date;
        this.produits = produits;
    }
    

    public Commande(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    
      public Commande() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LigneCommandeProduit> getProduits() {
        return produits;
    }

    public void setProduits(List<LigneCommandeProduit> produits) {
        this.produits = produits;
    }

  
    
    
}
