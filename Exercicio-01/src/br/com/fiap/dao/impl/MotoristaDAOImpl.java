package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Motorista;

public class MotoristaDAOImpl implements MotoristaDAO {

	EntityManager em;

	public MotoristaDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(Motorista motorista) {
		em.persist(motorista);
	}

	@Override
	public Motorista find(int codigo) {
		return em.find(Motorista.class, codigo);
	}

	@Override
	public void update(Motorista motorista) {
		em.merge(motorista);

	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new CommitException("Erro ao gravar");
		}

	}

	@Override
	public void delete(int codigo) throws NotFoundException {
		Motorista mot = em.find(Motorista.class, codigo);
		if (mot == null) {
			throw new NotFoundException("Motorista não cadastrado!");
		}

	}

}
