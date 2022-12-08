package com.groupeisi.scolarite.Dao;

import com.groupeisi.scolarite.entities.Inscription;

import java.util.Date;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class InscriptionDaoImpl implements IInscriptionDao {

    private DB db = new DB();
    private int result;
    private ResultSet rs;

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public int create(Inscription inscription) {
        result = 0;
        try {
            String sql = "INSERT INTO inscription VALUES(null,?,?)";
            db.init(sql);


            String s = inscription.getDate();
            SimpleDateFormat sdf;
            sdf = new SimpleDateFormat("yyyy-MM-dd");


            db.getPstm().setDate(1, java.sql.Date.valueOf(inscription.getDate()));
            db.getPstm().setString(2, inscription.getClasse());

            result = db.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public int update(Inscription inscription) {
        return 0;
    }

    public int remove(int id) {
        return 0;
    }

    public Inscription get(int id) {
        return null;
    }

    public List<Inscription> getAll() {
        return null;
    }

    public Inscription login(java.sql.Date date, String classe) {
        return null;
    }

    public Inscription login(Date date, String classe) {
        return null;
    }
}
