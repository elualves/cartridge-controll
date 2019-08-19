package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Cartucho;

public class CartuchoService {
	
	public List<Cartucho> findAll() {
		List<Cartucho> list = new ArrayList<>();
		list.add(new Cartucho(1, 2, "3", "4", "5", "6", "7", "8", "9", "10", 11.0, 12.0, "13", 14));
		list.add(new Cartucho(2, 200, "300", "400", "500", "600", "700", "800", "900", "1000", 1100.0, 1200.0, "1300", 1400));
		return list;
	}
}
 