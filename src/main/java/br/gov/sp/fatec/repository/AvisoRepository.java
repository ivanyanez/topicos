package br.gov.sp.fatec.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Aviso;
import br.gov.sp.fatec.model.Descarte;

public interface AvisoRepository extends CrudRepository<Aviso,Long> {

}
