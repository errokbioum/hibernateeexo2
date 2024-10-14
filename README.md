# hibernateeexo2
# hibernateexo2

# Projet :gestion des produits

## Objectif du TP
Le but de ce rapport est de suivre les stock    au sein d'une entreprise Ces données sont collectées et stockées dans un système de gestion de base de données (SGBD) afin de faciliter le suivi et l'analyse de la progression du projet, ainsi que l’implémentation de Framework de persistance hibernate afin d’établir le mappage, et de maitriser aussi les relation onetomany et manytoOne ainsi que la relation ManytoMany 
## Structure du projet
Le projet est organisé de la manière suivante :
![projets](https://github.com/user-attachments/assets/d19cd904-5f3c-41d1-b8c1-007d35f8fb20)





  - `src/` : Contient le code source Java : 
ma.projet: 
     - `Test` : le test de l'application
     - ` util` : contient  une class connexion qui va faire liee la connexion avec 
la base de donnee. 
     - `dao ` : contient  une interface générique qui contrôle le comportement du 
service de chaque entité. 
     - ` entité `: contient les entités utulise dans le projet. 
     - ` service `: contient les services que cette application offre, les classes 
présente dans ce package son implémente d’interface dao. 
     - `Test` : ou on va effectuer les test. 


## Outil utulise :
  - `hibernate.
MySql.
java .
neatbeans.
## Méthodes utilisées

    - `  creat (T o) ` :  crée des enregistrements dans la base de donnée. 
  
  - `  delete (T o) `: supprimer des enregistrements dans la base de donne.

  - `update (T o) `:  modifié un enregistrement. 
    
  - ` T findById (int o) `: trouver un  enregistrement à partir de son id. 

   - `getAll () `:récupérer toute les enregistrements

   -  `ListM () `:permettant d’afficher la liste des produits par catégorie


  - `getLigne () `:permettant d’afficher les produits commandés dans une commande donnée
    
- `getPrixProd () `: permettant d’afficher la liste des produits dont le prix est supérieure à 100   permettant d’afficher les produits commandés dans une commande donnée


## Vue relationnel 
![projet3](https://github.com/user-attachments/assets/5c9da0c5-9289-4363-8a9d-054f8ad0160a)





## Test
Pour tester le projet :
1. Assurez-vous que votre serveur MySQL ou Oracle est en cours d'exécution.
3. Compilez et exécutez `Main.java` pour insérer et récupérer des données.










https://github.com/user-attachments/assets/7beb09d5-6029-4ca1-b3bc-58471e6d873c






## Auteurs

uête SQL suivante :
 

 
 
