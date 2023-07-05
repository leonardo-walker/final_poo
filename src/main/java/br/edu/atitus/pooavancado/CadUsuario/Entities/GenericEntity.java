package br.edu.atitus.pooavancado.CadUsuario.Entities;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class GenericEntity extends RepresentationModel<GenericEntity> implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
