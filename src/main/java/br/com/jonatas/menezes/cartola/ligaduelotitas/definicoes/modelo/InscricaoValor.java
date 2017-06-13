package br.com.jonatas.menezes.cartola.ligaduelotitas.definicoes.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "inscricao_valor")
public class InscricaoValor {

	@Id
	@Column(name = "id")
	private Long id;
	
    @Column(name = "valor")
    private Integer valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
    
    
}
