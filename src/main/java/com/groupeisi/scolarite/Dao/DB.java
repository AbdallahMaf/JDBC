package com.groupeisi.scolarite.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
public class DB {
	private static Logger logger = Logger.getLogger(DB.class);
	private PreparedStatement pstm;
	private ResultSet rs;
	private int result;
	private Connection cnx;
	
	private void openConnection() {
		BasicConfigurator.configure();
		String userMysql = "root";
		String passwordMysql = "";
		String url = "jdbc:mysql://localhost:3306/scolaritedb";
		try {
			//chargement du pilote
			 cnx = DriverManager.getConnection(url, userMysql, passwordMysql);
			 logger.debug("Connexion ok");
		}catch(Exception ex){
			ex.printStackTrace();
			logger.error("Connexion non ok");
		}
	}
	public void init (String sql) {
		try {
			openConnection();
			pstm = cnx.prepareStatement(sql);
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public int executeUpdate() {
		try {
			result = pstm.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	public ResultSet executeSelect() {
		try {
			rs = pstm.executeQuery();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rs;
	}
	public void closeConnection() {
		try {
			if(cnx != null) {
				cnx.close();
			}
			if (rs !=null) {
				rs.close();
			}
			if (pstm !=null) {
				pstm.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public PreparedStatement getPstm() {
		return this.pstm;
	}
}
