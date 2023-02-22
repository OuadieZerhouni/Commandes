package com.estf.Commandes.business;

import com.estf.Commandes.beans.Commandes;

import com.estf.Commandes.beans.Client;
import com.estf.Commandes.beans.LineComProd;
import com.estf.Commandes.beans.Produit;
import com.estf.Commandes.beans.Commande;

public interface Services {

    Client createClient(Client client);
    Client updateClient(Client client);
    Client deleteClient(Client client);
    Client findClientById(int id);
    Client[] findAllClients();

    Produit createProduit(Produit produit);
    Produit updateProduit(Produit produit);
    Produit deleteProduit(Produit produit);
    Produit findProduitById(int id);
    Produit[] findAllProduits();

    Commande createCommande(Commande commande);
    Commande updateCommande(Commande commande);
    Commande deleteCommande(Commande commande);
    Commande findCommandeById(int id);
    Commande[] findAllCommandes();

    LineComProd createLineComProd(LineComProd lineComProd);
    LineComProd updateLineComProd(LineComProd lineComProd);
    LineComProd deleteLineComProd(LineComProd lineComProd);
    LineComProd findLineComProdById(int id);
    LineComProd[] findAllLineComProds();




}
