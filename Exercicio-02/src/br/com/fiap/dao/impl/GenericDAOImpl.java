package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {

	EntityManager em;
	private Class<T> clazz;

	public GenericDAOImpl(EntityManager em) {
		super();
		this.em = em;
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void create(T entidade) {
		// TODO Auto-generated method stub
		em.persist(entidade);
	}

	@Override
	public void update(T entidade) {
		// TODO Auto-generated method stub
		em.merge(entidade);
	}

	@Override
	public void delete(K codigo) throws NotFoundException {
		// TODO Auto-generated method stub
		T entidade = find(codigo);
		if (entidade == null) {
			throw new NotFoundException("Código não encontrado");
		}
		em.remove(entidade);
	}

	@Override
	public T find(K codigo) {
		// TODO Auto-generated method stub
		return em.find(clazz, codigo);
	}

	@Override
	public void commit() throws CommitException {
		// TODO Auto-generated method stub
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new CommitException("Erro ao gravar");
		}
	}

}
