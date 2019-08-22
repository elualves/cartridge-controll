package application;

import model.dao.CartuchoDao;
import model.dao.DaoFactory;
import model.entities.Cartucho;

public class Program {

	public static void main(String[] args) {
		CartuchoDao cartuchoDao = DaoFactory.createCartuchoDao();
		Cartucho cartucho = cartuchoDao.findById(1);
		
		System.out.println(cartucho);

	}

}
