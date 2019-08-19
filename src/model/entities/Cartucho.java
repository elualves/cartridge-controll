package model.entities;

import java.io.Serializable;

public class Cartucho implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idcartucho;/*1*/
	private Integer codigo;/*2*/
	private String codigo_secundario;/*3*/
	private String data_entrada;/*4*/
	private String data_saida;/*5*/
	private String retirada_nome;/*6*/
	private String marca;/*7*/
	private String modelo;/*8*/
	private String cor;/*9*/
	private String tipo;/*10*/
	private Double peso_entrada;/*11*/
	private Double peso_saida;/*12*/
	private String status;/*13*/
	private Integer id_cliente;/*14*/
	
	public Cartucho() {
	}

	public Cartucho(Integer idcartucho, Integer codigo, String codigo_secundario, String data_entrada,
			String data_saida, String retirada_nome, String marca, String modelo, String cor, String tipo,
			Double peso_entrada, Double peso_saida, String status, Integer id_cliente) {
		
		this.idcartucho = idcartucho;
		this.codigo = codigo;
		this.codigo_secundario = codigo_secundario;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.retirada_nome = retirada_nome;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tipo = tipo;
		this.peso_entrada = peso_entrada;
		this.peso_saida = peso_saida;
		this.status = status;
		this.id_cliente = id_cliente;
	}

	public Integer getIdcartucho() {
		return idcartucho;
	}

	public void setIdcartucho(Integer idcartucho) {
		this.idcartucho = idcartucho;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCodigo_secundario() {
		return codigo_secundario;
	}

	public void setCodigo_secundario(String codigo_secundario) {
		this.codigo_secundario = codigo_secundario;
	}

	public String getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getData_saida() {
		return data_saida;
	}

	public void setData_saida(String data_saida) {
		this.data_saida = data_saida;
	}

	public String getRetirada_nome() {
		return retirada_nome;
	}

	public void setRetirada_nome(String retirada_nome) {
		this.retirada_nome = retirada_nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPeso_entrada() {
		return peso_entrada;
	}

	public void setPeso_entrada(Double peso_entrada) {
		this.peso_entrada = peso_entrada;
	}

	public Double getPeso_saida() {
		return peso_saida;
	}

	public void setPeso_saida(Double peso_saida) {
		this.peso_saida = peso_saida;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcartucho == null) ? 0 : idcartucho.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartucho other = (Cartucho) obj;
		if (idcartucho == null) {
			if (other.idcartucho != null)
				return false;
		} else if (!idcartucho.equals(other.idcartucho))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cartucho [idcartucho=" + idcartucho + ", codigo=" + codigo + ", codigo_secundario=" + codigo_secundario
				+ ", data_entrada=" + data_entrada + ", data_saida=" + data_saida + ", retirada_nome=" + retirada_nome
				+ ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", tipo=" + tipo + ", peso_entrada="
				+ peso_entrada + ", peso_saida=" + peso_saida + ", status=" + status + ", id_cliente=" + id_cliente
				+ "]";
	}
}
