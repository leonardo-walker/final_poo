package br.edu.atitus.pooavancado.CadUsuario.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido extends GenericEntity {
	
	private static final long serialVersionUID = 1L;
	private Date data;
	private Produto produto;
	private double quantidade;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
