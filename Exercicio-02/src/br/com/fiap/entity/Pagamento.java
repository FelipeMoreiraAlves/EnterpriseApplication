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
@Table(name = "T_codigo")
@SequenceGenerator(name = "codigo", sequenceName = "SQ_T_codigo")
public class Pagamento {

	@Id
	@Column(name = "cd_codigo")
	@GeneratedValue(generator = "codigo", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "dt_codigo", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar datacodigo;

	@Column(name = "vl_codigo", nullable = false)
	private double valorcodigo;

	@Column(name = "ds_forma_codigo", nullable = false)
	private FormaPagamento FormaPagamento;

	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pagamento(int codigo, Calendar datacodigo, double valorcodigo, FormaPagamento FormaPagamento) {
		super();
		this.codigo = codigo;
		this.datacodigo = datacodigo;
		this.valorcodigo = valorcodigo;
		this.FormaPagamento = FormaPagamento;
	}

	public int getcodigo() {
		return codigo;
	}

	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDatacodigo() {
		return datacodigo;
	}

	public void setDatacodigo(Calendar datacodigo) {
		this.datacodigo = datacodigo;
	}

	public double getValorcodigo() {
		return valorcodigo;
	}

	public void setValorcodigo(double valorcodigo) {
		this.valorcodigo = valorcodigo;
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento;
	}

	public void setFormaPagamento(FormaPagamento FormaPagamento) {
		this.FormaPagamento = FormaPagamento;
	}

}
