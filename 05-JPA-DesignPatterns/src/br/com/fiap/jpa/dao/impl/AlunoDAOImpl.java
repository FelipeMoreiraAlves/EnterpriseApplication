package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Aluno;
import br.com.fiap.jpa.dao.AlunoDAO;

public class AlunoDAOImpl extends GenericDAOImpl<Aluno, String>
implements AlunoDAO{

	public AlunoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
