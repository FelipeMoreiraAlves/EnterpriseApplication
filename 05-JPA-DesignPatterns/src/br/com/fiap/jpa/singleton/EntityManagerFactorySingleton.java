package br.com.fiap.jpa.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//Construtor privado
	private EntityManagerFactorySingleton() {}
	
	//Atributo estático
	private static EntityManagerFactory fabrica;
	
	//Método estático
	public static EntityManagerFactory getInstance() {
		if (fabrica == null){
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
}
