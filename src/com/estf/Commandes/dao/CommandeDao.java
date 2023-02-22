package com.estf.Commandes.dao;
import com.estf.Commandes.beans.Commande;

public interface CommandeDao {
    public Commande create(Commande commande);
    public Commande update(Commande commande);
    public Commande delete(Commande commande);
    public Commande findById(int id);
    public Commande[] findAll();


}
