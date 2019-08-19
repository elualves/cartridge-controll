package model.entities;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idCliente;
	private String nome;
	private String apelido;
	private String observacao;
	private String email;
	private String cpf;
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneConv1;
	private String tefefoneConv2;
	private String telefoneCel1;
	private String telefoneCel2;
	private String telefoneCel3;
	
	private Cartucho cartucho;
	
	public Cliente() {
		
	}

	public Cliente(Integer idCliente, String nome, String apelido, String observacao, String email, String cpf,
			String cnpj, String inscricaoEstadual, String telefoneConv1, String tefefoneConv2, String telefoneCel1,
			String telefoneCel2, String telefoneCel3, Cartucho cartucho) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.apelido = apelido;
		this.observacao = observacao;
		this.email = email;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.telefoneConv1 = telefoneConv1;
		this.tefefoneConv2 = tefefoneConv2;
		this.telefoneCel1 = telefoneCel1;
		this.telefoneCel2 = telefoneCel2;
		this.telefoneCel3 = telefoneCel3;
		this.cartucho = cartucho;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getTelefoneConv1() {
		return telefoneConv1;
	}

	public void setTelefoneConv1(String telefoneConv1) {
		this.telefoneConv1 = telefoneConv1;
	}

	public String getTefefoneConv2() {
		return tefefoneConv2;
	}

	public void setTefefoneConv2(String tefefoneConv2) {
		this.tefefoneConv2 = tefefoneConv2;
	}

	public String getTelefoneCel1() {
		return telefoneCel1;
	}

	public void setTelefoneCel1(String telefoneCel1) {
		this.telefoneCel1 = telefoneCel1;
	}

	public String getTelefoneCel2() {
		return telefoneCel2;
	}

	public void setTelefoneCel2(String telefoneCel2) {
		this.telefoneCel2 = telefoneCel2;
	}

	public String getTelefoneCel3() {
		return telefoneCel3;
	}

	public void setTelefoneCel3(String telefoneCel3) {
		this.telefoneCel3 = telefoneCel3;
	}

	public Cartucho getCartucho() {
		return cartucho;
	}

	public void setCartucho(Cartucho cartucho) {
		this.cartucho = cartucho;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", apelido=" + apelido + ", observacao="
				+ observacao + ", email=" + email + ", cpf=" + cpf + ", cnpj=" + cnpj + ", inscricaoEstadual="
				+ inscricaoEstadual + ", telefoneConv1=" + telefoneConv1 + ", tefefoneConv2=" + tefefoneConv2
				+ ", telefoneCel1=" + telefoneCel1 + ", telefoneCel2=" + telefoneCel2 + ", telefoneCel3=" + telefoneCel3
				+ ", cartucho=" + cartucho + "]";
	}
	
}
