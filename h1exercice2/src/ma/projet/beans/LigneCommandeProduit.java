/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author OUMAIMA
 */
@Entity
public class LigneCommandeProduit {
    @EmbeddedId
    private ProduitCommandePk pk; 
    @ManyToOne
    @JoinColumn(name = "produit",insertable = false,updatable = false)
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "commande",insertable = false,updatable = false)
    private Commande commande;
    private int quantite;

    public LigneCommandeProduit(Commande commande) {
        this.commande = commande;
    }
 


    public LigneCommandeProduit(ProduitCommandePk pk, Produit produit, Commande commande, int quantite) {
        this.pk = pk;
        this.produit = produit;
        this.commande = commande;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }
  
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public LigneCommandeProduit(ProduitCommandePk pk, Produit produit, Commande commande) {
        this.pk = pk;
        this.produit = produit;
        this.commande = commande;
    }

    public LigneCommandeProduit() {
    }
    

    public ProduitCommandePk getPk() {
        return pk;
    }

    public void setPk(ProduitCommandePk pk) {
        this.pk = pk;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    
    
}
