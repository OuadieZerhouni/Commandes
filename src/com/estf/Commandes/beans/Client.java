package com.estf.Commandes.beans;

public class Client {

  private int Numero;
  private String Nom;

  public Client() {
    super();
  }

  public Client(Client client) {
    super();
    Numero = client.getNumero();
    Nom = client.getNom();
  }

  public Client(int numero, String nom) {
    super();
    Numero = numero;
    Nom = nom;
  }

  public int getNumero() {
    return Numero;
  }

  public void setNumero(int numero) {
    Numero = numero;
  }

  public String getNom() {
    return Nom;
  }

  public void setNom(String nom) {
    Nom = nom;
  }
}
