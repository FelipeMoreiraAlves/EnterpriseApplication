package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.VeiculoDAO;
import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.dao.exception.NotFoundException;
import br.com.fiap.entity.Veiculo;

public class VeiculoDAOImpl extends GenericDAOImpl<Veiculo, Integer> implements VeiculoDAO {

	public VeiculoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}



}
