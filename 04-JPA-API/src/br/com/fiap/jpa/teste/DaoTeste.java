package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.dao.CarroDAO;
import br.com.fiap.jpa.dao.impl.CarroDAOImpl;
import br.com.fiap.jpa.entity.Carro;
import br.com.fiap.jpa.entity.TipoCarro;
import br.com.fiap.jpa.exception.CommitException;

public class DaoTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		CarroDAO dao =  new CarroDAOImpl(em);
		
		Carro carro = new Carro("Focus", 2016, "AAA3333", 
				TipoCarro.PASSEIO, new GregorianCalendar(2016,Calendar.AUGUST,2), null);
		
		try {
			dao.create(carro);
			dao.commit();
			System.out.println("Cadastrado");
		}catch(CommitException e) {
			System.err.println(e.getMessage());
		}
		
		//Busca
		Carro carroBusca = dao.find(carro.getCodigo());
		System.out.println(carroBusca.getModelo());
		
		//Atualiza��o
		carroBusca.setModelo("Fusion");
		try {
			dao.update(carroBusca);
			dao.commit();
			System.out.println("Atualizado!");
		}catch (CommitException e) {
			System.err.println(e.getMessage());
		}
		
		//Remo��o
		try {
			dao.delete(carroBusca.getCodigo());
			dao.commit();
			System.out.println("Removido!");
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		em.close();
		fabrica.close();
	}
}
