package br.com.fiap.bo;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface ClienteBO {

	double calcularImpostoRenda(double rendimento);
	
}
