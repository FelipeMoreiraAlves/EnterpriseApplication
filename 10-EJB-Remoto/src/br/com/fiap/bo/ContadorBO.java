package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface ContadorBO {
	public void incrementar();

	public int verTotal();
}
