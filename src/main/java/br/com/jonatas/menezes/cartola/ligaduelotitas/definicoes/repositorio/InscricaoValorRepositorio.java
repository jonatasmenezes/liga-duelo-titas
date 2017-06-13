package br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.modelo.InscricaoValor;

public interface InscricaoValorRepositorio extends Repository<InscricaoValor, Long> {
	
	@Query("SELECT valor FROM InscricaoValor where id=1")
	Integer findValor();

}
