package br.com.jonatas.menezes.cartola.liga.duelo.titas.configuration.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.jonatas.menezes.cartola.liga.duelo.titas.configuration.model.InscricaoValor;

public interface InscricaoValorRepositorio extends Repository<InscricaoValor, Long> {
	
	@Query("SELECT valor FROM InscricaoValor where id=1")
	Integer findValor();

}
