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

	private Connection conn;// depend�ncia de conex�o com o banco de dados

	public CartuchoDaoJDBC(Connection conn) {// construtor for�ando a conex�o
		this.conn = conn;
	}

	@Override
	public Cartucho findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM cartucho WHERE Idcartucho = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Cartucho obj = new Cartucho();

				obj.setIdcartucho(rs.getInt("idcartucho"));/* 1 */
				obj.setCodigo(rs.getInt("codigo"));/* 2 */
				obj.setCodigo_secundario(rs.getString("codigo_secundario"));/* 3 */
				obj.setData_entrada(rs.getString("data_entrada"));/* 4 */
				obj.setData_saida(rs.getString("data_saida"));/* 5 */
				obj.setRetirada_nome(rs.getString("retirada_nome"));/* 6 */
				obj.setMarca(rs.getString("marca"));/* 7 */
				obj.setModelo(rs.getString("modelo"));/* 8 */
				obj.setCor(rs.getString("cor"));/* 9 */
				obj.setTipo(rs.getString("tipo"));/* 10 */
				obj.setPeso_entrada(rs.getDouble("peso_entrada"));/* 11 */
				obj.setPeso_saida(rs.getDouble("peso_saida"));/* 12 */
				obj.setStatus(rs.getString("status"));/* 13 */
				obj.setId_cliente(rs.getInt("id_cliente"));/* 14 */

				return obj;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	/* SELECT LIST ALL--------------------------------------------------- */
	@Override
	public List<Cartucho> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM cartucho ORDER BY IDCARTUCHO");
			rs = st.executeQuery();

			List<Cartucho> list = new ArrayList<>();

			while (rs.next()) {
				Cartucho obj = new Cartucho();
				obj.setIdcartucho(rs.getInt("idcartucho"));/* 1 */
				obj.setCodigo(rs.getInt("codigo"));/* 2 */
				obj.setCodigo_secundario(rs.getString("codigo_secundario"));/* 3 */
				obj.setData_entrada(rs.getString("data_entrada"));/* 4 */
				obj.setData_saida(rs.getString("data_saida"));/* 5 */
				obj.setRetirada_nome(rs.getString("retirada_nome"));/* 6 */
				obj.setMarca(rs.getString("marca"));/* 7 */
				obj.setModelo(rs.getString("modelo"));/* 8 */
				obj.setCor(rs.getString("cor"));/* 9 */
				obj.setTipo(rs.getString("tipo"));/* 10 */
				obj.setPeso_entrada(rs.getDouble("peso_entrada"));/* 11 */
				obj.setPeso_saida(rs.getDouble("peso_saida"));/* 12 */
				obj.setStatus(rs.getString("status"));/* 13 */
				obj.setId_cliente(rs.getInt("id_cliente"));/* 14 */
				list.add(obj);
			}
			return list;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	/* INSERT---------------------------------------------------------- */
	@Override
	public void insert(Cartucho obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO cartucho "
					+ "(CODIGO, CODIGO_SECUNDARIO, DATA_ENTRADA, DATA_SAIDA, RETIRADA_NOME, MARCA, MODELO, COR, TIPO, PESO_ENTRADA, PESO_SAIDA, STATUS, ID_CLIENTE) "
					+ "VALUES " + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			st.setInt(1, obj.getCodigo());
			st.setString(2, obj.getCodigo_secundario());
			st.setString(3, obj.getData_entrada());
			st.setString(4, obj.getData_saida());
			st.setString(5, obj.getRetirada_nome());
			st.setString(6, obj.getMarca());
			st.setString(7, obj.getModelo());
			st.setString(8, obj.getCor());
			st.setString(9, obj.getTipo());
			st.setDouble(10, obj.getPeso_entrada());
			st.setDouble(11, obj.getPeso_saida());
			st.setString(12, obj.getStatus());
			st.setInt(13, obj.getId_cliente());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int idcartucho = rs.getInt(1);
					obj.setIdcartucho(idcartucho);
				}
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	/* UPDATE----------------------------------------------------------- */
	@Override
	public void update(Cartucho obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE cartucho "
					+ "SET CODIGO = ? , CODIGO_SECUNDARIO = ?, DATA_ENTRADA = ?, DATA_SAIDA = ?, RETIRADA_NOME = ?, MARCA = ?, MODELO = ?, COR = ?, TIPO = ?, PESO_ENTRADA = ?, PESO_SAIDA = ?, STATUS, ID_CLIENTE = ?"
					+ "WHERE Id = ?");

			st.setInt(1, obj.getCodigo());
			st.setString(2, obj.getCodigo_secundario());
			st.setString(3, obj.getData_entrada());
			st.setString(4, obj.getData_saida());
			st.setString(5, obj.getRetirada_nome());
			st.setString(6, obj.getMarca());
			st.setString(7, obj.getModelo());
			st.setString(8, obj.getCor());
			st.setString(9, obj.getTipo());
			st.setDouble(10, obj.getPeso_entrada());
			st.setDouble(11, obj.getPeso_saida());
			st.setString(12, obj.getStatus());
			st.setInt(13, obj.getId_cliente());

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	/* DELETE------------------------------------------------------------- */
	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM cartucho " + "WHERE " + "Id = ?");

			st.setInt(1, id);

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {

			DB.closeStatement(st);
		}
	}
}
