package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Endereco {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="end_id")
	private String id;
	
	@Column(name="end_rua")
	private String rua;
		
	@Column(name="end_numero")
	private Integer numero;
	
	@Column(name="end_cep")
	private String cep;
	
	@Column(name="end_cidade")
	private String cidade;
	
	@Column(name="end_estado")
	private String estado;

}
