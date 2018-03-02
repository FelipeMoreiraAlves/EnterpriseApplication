package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Carro;

public class RemoverTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Carro carro = em.find(Carro.class, 1);
		em.remove(carro);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.clear();
		fabrica.close();
		// Remover um carro!
		
		
	}
}
