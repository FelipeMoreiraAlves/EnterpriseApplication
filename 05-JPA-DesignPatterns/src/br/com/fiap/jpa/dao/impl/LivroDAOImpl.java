package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Livro;
import br.com.fiap.jpa.dao.LivroDAO;

public class LivroDAOImpl extends GenericDAOImpl<Livro, Integer>implements LivroDAO {

	public LivroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
