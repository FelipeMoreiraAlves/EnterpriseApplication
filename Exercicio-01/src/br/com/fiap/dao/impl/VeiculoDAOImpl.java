package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Veiculo;

public class VeiculoDAOImpl implements VeiculoDAO {

	private EntityManager em;

	public VeiculoDAOImpl() {
		super();
	}

	@Override
	public void create(Veiculo veiculo) {
		em.persist(veiculo);

	}

	@Override
	public void update(Veiculo veiculo) {
		em.merge(veiculo);

	}

	@Override
	public Veiculo find(int codigo) {
		return em.find(Veiculo.class, codigo);
	}

	@Override
	public void delete(int codigo) throws NotFoundException {
		Veiculo veiculo = em.find(Veiculo.class, codigo);
		if (veiculo == null) {
			throw new NotFoundException("Veiculo não cadastrado!");
		}
		em.remove(veiculo);
	}

	@Override
	public void commit() throws CommitException{
		
		try{
			em.getTransaction().begin();;
			em.getTransaction().commit();
		}catch (Exception e) {
			if (em.getTransaction().isActive()) { 
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new CommitException("Erro ao gravar");
		}
	}

}
