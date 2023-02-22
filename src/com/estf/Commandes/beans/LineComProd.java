package com.estf.Commandes.beans;

public class LineComProd {

  private int id;
  private int qte;
  private int IdCom;
  private int IdProd;

  public LineComProd() {
    super();
  }

  public LineComProd(LineComProd lineComProd) {
    super();
    id = lineComProd.getId();
    qte = lineComProd.getQte();
    IdCom = lineComProd.getIdCom();
    IdProd = lineComProd.getIdProd();
  }

  public LineComProd(int id, int qte, int idCom, int idProd) {
    super();
    this.id = id;
    this.qte = qte;
    IdCom = idCom;
    IdProd = idProd;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQte() {
    return qte;
  }

  public void setQte(int qte) {
    this.qte = qte;
  }

  public int getIdCom() {
    return IdCom;
  }

  public void setIdCom(int idCom) {
    IdCom = idCom;
  }

  public int getIdProd() {
    return IdProd;
  }

  public void setIdProd(int idProd) {
    IdProd = idProd;
  }
}
