package com.estf.Commandes.dao;
import com.estf.Commandes.beans.Client;

public interface ClientDao {
    public Client save(Client client);
    public Client update(Client client);
    public Client delete(Client client);
    public Client findById(int id);
    public Client[] findAll();
 

}
