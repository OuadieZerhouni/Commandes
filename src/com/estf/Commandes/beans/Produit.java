package com.estf.Commandes.beans;

public class Produit {

  private int id;
  private int prix;
  private String Nom;

  public Produit() {
    super();
  }

  public Produit(Produit produit) {
    super();
    id = produit.getId();
    prix = produit.getPrix();
    Nom = produit.getNom();
  }

  public Produit(int id, int prix, String nom) {
    super();
    this.id = id;
    this.prix = prix;
    Nom = nom;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPrix() {
    return prix;
  }

  public void setPrix(int prix) {
    this.prix = prix;
  }

  public String getNom() {
    return Nom;
  }

  public void setNom(String nom) {
    Nom = nom;
  }
}
