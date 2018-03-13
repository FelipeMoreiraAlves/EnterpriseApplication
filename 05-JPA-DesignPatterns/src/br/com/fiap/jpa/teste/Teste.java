package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.entity.Aluno;
import br.com.fiap.jpa.dao.AlunoDAO;
import br.com.fiap.jpa.dao.impl.AlunoDAOImpl;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) throws CommitException, KeyNotFoundException {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		// cadastrar
		AlunoDAO dao = new AlunoDAOImpl(em);
		Aluno aluno = new Aluno("rm772746", "Felipe");
		try {
			dao.inserir(aluno);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		// buscar

		Aluno busca = dao.pesquisar(aluno.getRm());
		System.out.println(busca.getNome());

		// atualizar
		busca.setNome("King James");
		try {
			dao.atualizar(busca);
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
		}

		// remover
		try{
			dao.remover(busca.getRm());
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
		}

		em.close();
		fabrica.close();
	}
}
