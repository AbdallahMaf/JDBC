package com.groupeisi.scolarite.Dao;

import java.util.List;

import com.groupeisi.scolarite.entities.User;

import java.sql.ResultSet;
import java.util.Collections;

public class UserDaoImpl implements IUserDao {

	private DB db = new DB();
	private int result;
	private ResultSet rs;

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public int create(User user) {
		result = 0;
		try {
			String sql = "INSERT INTO user VALUES(null,?,?)";
			db.init(sql);
			db.getPstm().setString(1, user.getEmail());
			db.getPstm().setString(2, user.getPassword());

			result = db.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}

	public int update(User user) {

		return 0;
	}

	public int remove(int id) {

		return 0;
	}

	public User get(int id) {

		return null;
	}

	public List<User> getAll() {
		return Collections.emptyList();

	}

	public User login(String email, String password) {

		return null;
	}

}
