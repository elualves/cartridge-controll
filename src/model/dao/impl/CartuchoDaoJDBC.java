package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.CartuchoDao;
import model.entities.Cartucho;

public class CartuchoDaoJDBC implements CartuchoDao {

	
	private Connection conn;//dependência de conexão com o banco de dados
	
	public CartuchoDaoJDBC(Connection conn)//contrutor forçando a conexão 
	{
		this.conn = conn;
	}
	
	
	/*findById*/
	@Override
	public Cartucho findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
				"SELECT * FROM cartucho WHERE Idcartucho = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Cartucho obj = new Cartucho();
				
				obj.setIdcartucho(rs.getInt("idcartucho"));/*1*/
				
				obj.setCodigo(rs.getInt("codigo"));/*2*/
				obj.setCodigo_secundario(rs.getString("codigo_secundario"));/*3*/
				obj.setData_entrada(rs.getString("data_entrada"));/*4*/
				obj.setData_saida(rs.getString("data_saida"));/*5*/
				obj.setRetirada_nome(rs.getString("retirada_nome"));/*6*/
				obj.setMarca(rs.getString("marca"));/*7*/
				obj.setModelo(rs.getString("modelo"));/*8*/
				obj.setCor(rs.getString("cor"));/*9*/
				obj.setTipo(rs.getString("tipo"));/*10*/
				obj.setPeso_entrada(rs.getDouble("peso_entrada"));/*11*/
				obj.setPeso_saida(rs.getDouble("peso_saida"));/*12*/
				obj.setStatus(rs.getString("status"));/*13*/
				obj.setId_cliente(rs.getInt("id_cliente"));/*14*/
				
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
	
	/*SELECT LIST ALL---------------------------------------------------*/
	@Override
	public List<Cartucho> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
				"SELECT * FROM cartucho ORDER BY Name");
			rs = st.executeQuery();

			List<Cartucho> list = new ArrayList<>();

			while (rs.next()) {
				Cartucho obj = new Cartucho();
				//obj.setId(rs.getInt("Id"));
				//obj.setName(rs.getString("Name"));
				list.add(obj);
			}
			return list;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
	
	/*INSERT----------------------------------------------------------*/
	@Override
	public void insert(Cartucho obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
				"INSERT INTO cartucho " +
				"(Name) " +
				"VALUES " +
				"(?)", 
				Statement.RETURN_GENERATED_KEYS);

			//st.setString(1, obj.getName());

			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int idcartucho = rs.getInt(1);
					obj.setIdcartucho(idcartucho);
				}
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
		}
	}
	
    /*UPDATE-----------------------------------------------------------*/
	@Override
	public void update(Cartucho obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
				"UPDATE cartucho " +
				"SET Name = ? " +
				"WHERE Id = ?");

			//st.setString(1, obj.getName());
			//st.setInt(2, obj.getId());

			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
		}
	}

	
	/*DELETE-------------------------------------------------------------*/
	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
				"DELETE FROM cartucho WHERE Id = ?");

			st.setInt(1, id);

			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
		}
	}
}
