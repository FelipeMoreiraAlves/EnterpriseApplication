package br.com.fiap.nac.dao.impl;

import br.com.fiap.nac.entity.Locacao;

import javax.persistence.EntityManager;

import br.com.fiap.nac.dao.LocacaoDAO;

public class LocacaoDAOImpl extends GenericDAOImpl<Locacao, Integer> implements LocacaoDAO {

	public LocacaoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
