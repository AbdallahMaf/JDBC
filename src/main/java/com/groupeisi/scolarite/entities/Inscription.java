package com.groupeisi.scolarite.entities;

import java.io.Serializable;
import java.util.Date;

public class Inscription implements Serializable {

    private int id;
    private Date date ;
    private String classe;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }
}
