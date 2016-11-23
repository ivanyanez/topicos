package br.gov.sp.fatec.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="pessoa_id")
	private String id;
	
	@Column(name="pessoa_nome")
	private String nome;
	
	@Column(name="pessoa_sobrenome")
	private String sobrenome;
	
	@Column(name="pessoa_dataNasc")
	private Date pessoa_dataNasc;
	
	@Column(name="pessoa_email")
	private String email;
		
	@Column(name="pessoa_rg")
	private String rg;
	
	@Column(name="pessoa_cpf")
	private String cpf;

	public Pessoa(String id, String nome, String sobrenome, Date pessoa_dataNasc, String email, String rg, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.pessoa_dataNasc = pessoa_dataNasc;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getPessoa_dataNasc() {
		return pessoa_dataNasc;
	}

	public void setPessoa_dataNasc(Date pessoa_dataNasc) {
		this.pessoa_dataNasc = pessoa_dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
