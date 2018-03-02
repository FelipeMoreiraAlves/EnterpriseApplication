package br.com.fiap.bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import oracle.jdbc.logging.annotations.Log;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {

	@Id
	@Column(name = "nr_carteira")
	private int carteira;

	@Column(name = "nm_motorista", nullable = false, length = 150)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Lob
	@Column(name="fl_carteira")
	private byte [] fotoCarteira;
	
}
