/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author OUMAIMA
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reference;
 @OneToMany(fetch = FetchType.EAGER,mappedBy = "produit" )
   List < LigneCommandeProduit> commandes=null ;
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", reference=" + reference + ", prix=" + prix + "," + '}';
    }
    private float prix;
    @ManyToOne
            
    Categorie categorie =null;
     public Produit(String reference, float prix,Categorie categorie) {
        this.reference = reference;
        this.prix = prix;
        this.categorie=categorie;
    }
      
    public Produit(String reference, float prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public Produit(int id, String reference, float prix) {
        this.id = id;
        this.reference = reference;
        this.prix = prix;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<LigneCommandeProduit> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<LigneCommandeProduit> commandes) {
        this.commandes = commandes;
    }
    
    
}
