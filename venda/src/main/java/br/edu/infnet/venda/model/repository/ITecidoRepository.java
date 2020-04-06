package br.edu.infnet.venda.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.venda.model.negocio.Tecido;

@Repository
public interface ITecidoRepository extends CrudRepository<Tecido, Integer> {

}
