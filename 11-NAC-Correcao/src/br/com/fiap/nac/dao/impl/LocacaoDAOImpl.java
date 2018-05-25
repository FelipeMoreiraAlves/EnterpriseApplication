package br.com.fiap.nac.dao.impl;

import br.com.fiap.nac.entity.Locacao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.nac.dao.LocacaoDAO;

public class LocacaoDAOImpl extends GenericDAOImpl<Locacao, Integer> implements LocacaoDAO {

	public LocacaoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Locacao> listarPorDataInicio(Calendar inicio, Calendar fim) {
		// TODO Auto-generated method stub
		return em.createQuery("from Locacao l where l.dataInicio between :p1 and :p2", Locacao.class)
				.setParameter("p1", inicio).setParameter("p2", fim).getResultList();
	}

	@Override
	public long contarPorCodigo(int codigo) {
		// TODO Auto-generated method stub
		return em.createQuery("select count(l) from Locacao l where l.cliente.codigo = :codigo ", Long.class )
				.setParameter("codigo", codigo).getSingleResult();
	}

}
