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
import javax.persistence.OneToMany;

/**
 *
 * @author OUMAIMA
 */
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String Code;
    private String Libelle;
    
    
     
    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    @OneToMany(fetch = FetchType.EAGER ,    mappedBy = "categorie")
    List<Produit >produits=null;
    public Categorie() {
    }
    

   

    public Categorie(int id, String Code, String Libelle) {
        this.id = id;
        this.Code = Code;
        this.Libelle = Libelle;
    }

    public Categorie(String Code, String Libelle) {
        this.Code = Code;
        this.Libelle = Libelle;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", Code=" + Code + ", Libelle=" + Libelle + '}';
    }
    
    
    
    
}
