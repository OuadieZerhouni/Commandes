package com.estf.Commandes.dao;
import com.estf.Commandes.beans.LineComProd;

public interface LineComProdDao {
    public LineComProd save(LineComProd lineComProd);
    public LineComProd update(LineComProd lineComProd);
    public LineComProd delete(LineComProd lineComProd);
    public LineComProd findById(int id);
    public LineComProd[] findAll();

    


}
