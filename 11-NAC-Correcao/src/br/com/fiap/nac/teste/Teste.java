package br.com.fiap.nac.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.dao.impl.LocacaoDAOImpl;
import br.com.fiap.nac.entity.Apartamento;
import br.com.fiap.nac.entity.Cliente;
import br.com.fiap.nac.entity.Locacao;
import br.com.fiap.nac.entity.Sexo;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		Cliente cliente = new Cliente("Teste", Calendar.getInstance(), Sexo.FEMININO);
		Apartamento ap = new Apartamento("Av teste", "testes", null);

		Locacao locacao = new Locacao(Calendar.getInstance(), Calendar.getInstance());
		locacao.setApartamento(ap);
		locacao.setCliente(cliente);

		// Cadastrar
		LocacaoDAO dao = new LocacaoDAOImpl(em);
		try {
			dao.cadastrar(locacao);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}

		em.close();
		fabrica.close();
	}
}
