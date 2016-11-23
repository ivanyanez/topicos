package br.gov.sp.fatec.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;


@Entity
@Table
public class Afericao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="afericao_id")
	private Long afericao_id;
	
	@Column(name="aferido_data")
	private Date aferido_data;
	
	@Column(name="aferido_em")
	private Date aferido_em;	 

}
