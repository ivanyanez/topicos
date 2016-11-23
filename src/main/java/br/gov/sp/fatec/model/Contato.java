package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="contato")
public class Contato {
		
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="contato_id")
	private long contato_id;
	
	@Column(name="contato_residencial")
	private String telefone_residencial;
	
	
	@Column(name="contato_comercial")
	private String telefone_comercial;
	
	@Column(name="contato_celular")
	private String telefone_celular;

	public Contato(long contato_id, String telefone_residencial, String telefone_comercial, String telefone_celular) {
		super();
		this.contato_id = contato_id;
		this.telefone_residencial = telefone_residencial;
		this.telefone_comercial = telefone_comercial;
		this.telefone_celular = telefone_celular;
	}

	public long getContato_id() {
		return contato_id;
	}

	public void setContato_id(long contato_id) {
		this.contato_id = contato_id;
	}

	public String getTelefone_residencial() {
		return telefone_residencial;
	}

	public void setTelefone_residencial(String telefone_residencial) {
		this.telefone_residencial = telefone_residencial;
	}

	public String getTelefone_comercial() {
		return telefone_comercial;
	}

	public void setTelefone_comercial(String telefone_comercial) {
		this.telefone_comercial = telefone_comercial;
	}

	public String getTelefone_celular() {
		return telefone_celular;
	}

	public void setTelefone_celular(String telefone_celular) {
		this.telefone_celular = telefone_celular;
	}

}
