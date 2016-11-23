package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
public class Descarte {
	
	
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="descarte_id")
	private String descarte_id;
	
	
	@Column(name="descarte_descricao")
	private String descarte_descricao;
	

}
