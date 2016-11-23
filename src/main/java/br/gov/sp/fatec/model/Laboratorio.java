package br.gov.sp.fatec.model;

public class Laboratorio {
	
	private long lab_id;
	
	private String lab_descricao;
	
	private Integer lab_numero;

	public Laboratorio(long lab_id, String lab_descricao, Integer lab_numero) {
		super();
		this.lab_id = lab_id;
		this.lab_descricao = lab_descricao;
		this.lab_numero = lab_numero;
	}

	public long getLab_id() {
		return lab_id;
	}

	public void setLab_id(long lab_id) {
		this.lab_id = lab_id;
	}

	public String getLab_descricao() {
		return lab_descricao;
	}

	public void setLab_descricao(String lab_descricao) {
		this.lab_descricao = lab_descricao;
	}

	public Integer getLab_numero() {
		return lab_numero;
	}

	public void setLab_numero(Integer lab_numero) {
		this.lab_numero = lab_numero;
	}
	
	

}
