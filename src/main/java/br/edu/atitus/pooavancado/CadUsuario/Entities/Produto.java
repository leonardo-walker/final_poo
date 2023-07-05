package br.edu.atitus.pooavancado.CadUsuario.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto extends GenericEntity {
	

	private static final long serialVersionUID = 1L;
	private String descricao;
	private String unidadeMedida;
	private double valorUnitario;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
