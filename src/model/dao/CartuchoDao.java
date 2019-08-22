package model.dao;

import java.util.List;

import model.entities.Cartucho;

public interface CartuchoDao {
	
	void insert(Cartucho obj);
	void update(Cartucho obj);
	void deleteById(Integer id);
	Cartucho findById(Integer id);
	List<Cartucho> findAll();

}
