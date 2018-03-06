package br.com.fiap.jpa.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Motorista;

public class AtualizarTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Motorista motorista = new Motorista("Gol", 2015, "DDD9090", 
			Calendar.getInstance(),Genero.MASCULINO);
		
		carro.setCodigo(1);
		
		em.getTransaction().begin();
		em.merge(carro);//Atualizar
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
	
}


