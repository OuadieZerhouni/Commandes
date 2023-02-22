package com.estf.Commandes.dao;
import com.estf.Commandes.beans.Produit;

public interface ProduitDao {
    public Produit save(Produit produit);
    public Produit update(Produit produit);
    public Produit delete(Produit produit);
    public Produit findById(int id);
    public Produit[] findAll();

}
