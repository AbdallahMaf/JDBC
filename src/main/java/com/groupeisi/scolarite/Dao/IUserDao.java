package com.groupeisi.scolarite.Dao;

import java.util.List;

import com.groupeisi.scolarite.entities.User;

public interface IUserDao {

	
	public int create (User user);
	public int update (User user);
	public int remove(int id);
	public User get (int id);
	public List<User> getAll();
	public User login (String email, String password);
}
