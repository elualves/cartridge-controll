package model.dao;

import db.DB;
import model.dao.impl.CartuchoDaoJDBC;

public class DaoFactory {
	
	public static CartuchoDao createCartuchoDao() {
		return new CartuchoDaoJDBC(DB.getConnection());
	}
}