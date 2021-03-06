package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_CORRIDA")
@SequenceGenerator(name = "corrida", sequenceName = "SQ_T_CORRIDA", allocationSize = 1)
public class Corrida {

	@Id
	@Column(name = "cd_corrida")
	@GeneratedValue(generator = "corrida", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "ds_origem", length = 150)
	private String origem;

	@Column(name = "ds_destino", length = 150)
	private String destino;

	@Column(name = "dt_corrida")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCorrida;

	@Column(name = "vl_corrida", nullable = false)
	private double valorCorrida;

	public Corrida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataCorrida() {
		return dataCorrida;
	}

	public void setDataCorrida(Calendar dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public double getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(double valorCorrida) {
		this.valorCorrida = valorCorrida;
	}

	public Corrida(int codigo, String origem, String destino, Calendar dataCorrida, double valorCorrida) {
		super();
		this.codigo = codigo;
		this.origem = origem;
		this.destino = destino;
		this.dataCorrida = dataCorrida;
		this.valorCorrida = valorCorrida;
	}

}
