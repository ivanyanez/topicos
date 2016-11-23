package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco,Long> {
	
	
	

}
