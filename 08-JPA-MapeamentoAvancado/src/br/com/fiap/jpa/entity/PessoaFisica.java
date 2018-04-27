package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_FISICA")
public class PessoaFisica extends Pessoa{

	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="nr_rg")
	private String rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public PessoaFisica(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, String endereco, String cpf, String rg) {
		super(nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	
	
	
}
