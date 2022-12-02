package com.groupeisi.scolarite.presentation;

import com.groupeisi.scolarite.Dao.IInscriptionDao;
import com.groupeisi.scolarite.Dao.InscriptionDaoImpl;
import com.groupeisi.scolarite.entities.Inscription;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.groupeisi.scolarite.Dao.IUserDao;
import com.groupeisi.scolarite.Dao.UserDaoImpl;
import com.groupeisi.scolarite.entities.User;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		IUserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setEmail("abdallahfall2020@gmail.com");
		user.setPassword("passer123Test");

		int result;
		result = userDao.create(user);
		logger.debug(result);

		IInscriptionDao inscriptionDao = new InscriptionDaoImpl();
		Inscription inscription = new Inscription();
		inscription.setDate("2022-03-20");
		inscription.setClasse("DITI4");

		int resultat;
		resultat = inscriptionDao.create(inscription);
		logger.debug(resultat);
	}
}
