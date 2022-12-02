package com.groupeisi.scolarite.Dao;

import com.groupeisi.scolarite.entities.Inscription;

import java.sql.Date;
import java.util.List;

public interface IInscriptionDao {

    public int create (Inscription inscription);
    public int update (Inscription inscription);
    public int remove(int id);
    public Inscription get (int id);
    public List<Inscription> getAll();
    public Inscription login (Date date, String classe);
}
