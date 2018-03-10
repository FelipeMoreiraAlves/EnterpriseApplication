package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.entity.Aluno;
import br.com.fiap.jpa.dao.AlunoDAO;
import br.com.fiap.jpa.dao.impl.AlunoDAOImpl;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) throws CommitException {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		
		//cadastrar
		AlunoDAOImpl dao = new AlunoDAOImpl(em);
		Aluno aluno = new Aluno("rm772746", "Felipe");
		em.persist(aluno);
		dao.commit();
		
		//buscar
		aluno = em.find(Aluno.class, "rm772746");
		
		//atualizar
		Aluno aluno2 = new Aluno("rm75244", "Romano");
		em.merge(aluno2);
		dao.commit();
		
		//remover
		aluno = em.find(Aluno.class, "rm75244");
		em.remove(aluno);
		
		
		
		em.close();
		fabrica.close();
	}
}
