package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.dao.impl.PessoaDAOImpl;
import br.com.fiap.jpa.entity.Pessoa;
import br.com.fiap.jpa.entity.PessoaFisica;
import br.com.fiap.jpa.entity.PessoaJuridica;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class HerancaTeste {

	public static void main(String[] args) {
		//Cadastrar uma Pessoa, PF e PJ
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		Pessoa pessoa = new Pessoa("Willian", "Jardins");
		PessoaFisica pf = new PessoaFisica("Peixoto", "Diadema","213.213.312-98","32.321.546-99");
		PessoaJuridica pj = new PessoaJuridica("FIAP", "Lins", "578.654.342/0001-8","FIAP");
	}
}
