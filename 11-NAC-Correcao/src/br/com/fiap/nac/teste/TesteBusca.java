package br.com.fiap.nac.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.nac.dao.ApartamentoDAO;
import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.dao.impl.ApartamentoDAOImpl;
import br.com.fiap.nac.dao.impl.LocacaoDAOImpl;
import br.com.fiap.nac.entity.Apartamento;
import br.com.fiap.nac.entity.Locacao;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Exercicio 1
		LocacaoDAO dao = new LocacaoDAOImpl(em);
		
		Calendar inicio = new GregorianCalendar(2015, Calendar.AUGUST,2);
		Calendar fim = new GregorianCalendar(2018, Calendar.AUGUST,2);
		
		List<Locacao> locacoes = dao.listarPorDataInicio(inicio, fim);
		for (Locacao locacao : locacoes) {
			System.out.println(locacao.getCliente().getNome());
		}
		
		//Exercicio 2
		System.out.println("Locações " + dao.contarPorCodigo(1));
		
		//Exercicio 3
		ApartamentoDAO apDao = new ApartamentoDAOImpl(em);
		List<Apartamento> aps = apDao.buscarTodos("e");
		for (Apartamento apartamento : aps) {
			System.out.println(apartamento.getDetalhes());
		}
		
		
		em.close();
		fabrica.close();
		
	}
}
