package br.gov.sp.fatec.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa,Long> {

}
