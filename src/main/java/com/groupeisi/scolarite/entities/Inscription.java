package com.groupeisi.scolarite.entities;

import java.io.Serializable;

public class Inscription implements Serializable {

    private int id;
    private String date ;
    private String classe;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getClasse() { return classe; }

    public void setClasse(String classe) { this.classe = classe; }

}
