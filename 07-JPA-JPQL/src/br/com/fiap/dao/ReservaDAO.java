package br.com.fiap.dao;

import java.util.Calendar;

import br.com.fiap.entity.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva,Integer>{

	long contarQuantidade();
	
	long contarQuantidadePorCliente(int idCliente);
	
	long contarPorDatas(Calendar inicio, Calendar fim);
	
	long contarPorEstadoCliente(String uf);
	
}
