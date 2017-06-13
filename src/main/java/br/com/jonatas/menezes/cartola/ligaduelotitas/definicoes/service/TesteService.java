package br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.repositorio.InscricaoValorRepositorio;

@Service
public class TesteService {

	private InscricaoValorRepositorio inscricaoValorRepositorio;

	@Autowired
	public TesteService(InscricaoValorRepositorio inscricaoValorRepositorio) {
		this.inscricaoValorRepositorio = inscricaoValorRepositorio;
	}

	public Integer getValorInscricaoLiga() {
		return inscricaoValorRepositorio.findValor();
	}

}
