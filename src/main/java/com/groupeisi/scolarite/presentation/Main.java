package com.groupeisi.scolarite.presentation;

import com.groupeisi.scolarite.Dao.IInscriptionDao;
import com.groupeisi.scolarite.Dao.InscriptionDaoImpl;
import com.groupeisi.scolarite.entities.Inscription;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.groupeisi.scolarite.Dao.IUserDao;
import com.groupeisi.scolarite.Dao.UserDaoImpl;
import com.groupeisi.scolarite.entities.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) throws ParseException {

		BasicConfigurator.configure();

		IUserDao userDao = new UserDaoImpl();
		User user = new User();
		user.setEmail("abdallahfall2020@gmail.com");
		user.setPassword("passer123Test");

		IInscriptionDao inscriptionDao = new InscriptionDaoImpl();
		Inscription inscription = new Inscription();
		inscription.setDate("2022-05-13");
		inscription.setClasse("DITI4");

		/*String s = "2011-07-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse(s);
		IInscriptionDao inscriptionDao = new InscriptionDaoImpl();
		Inscription inscription = new Inscription();
		inscription.setDate(date);
		inscription.setClasse("DITI4");*/

		int resultUser, resultInscription;
		resultUser = userDao.create(user);
		resultInscription = inscriptionDao.create(inscription);
		logger.debug(resultUser);
		logger.debug(resultInscription);
	}
}
