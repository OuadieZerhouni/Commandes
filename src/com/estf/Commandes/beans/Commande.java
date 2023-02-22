package com.estf.Commandes.beans;


public class Commande {

  private int id;
  private String Date;

  public Commande() {
    super();
  }

  public Commande(Commande commande) {
    super();
    id = commande.getId();
    Date = commande.getDate();
  }

  public Commande(int id, String date) {
    super();
    this.id = id;
    Date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return Date;
  }

  public void setDate(String date) {
    Date = date;
  }
}