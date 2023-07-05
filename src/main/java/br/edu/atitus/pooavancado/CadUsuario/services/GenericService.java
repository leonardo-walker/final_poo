package br.edu.atitus.pooavancado.CadUsuario.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.edu.atitus.pooavancado.CadUsuario.Entities.GenericEntity;
import br.edu.atitus.pooavancado.CadUsuario.repositories.GenericRepository;

public interface GenericService<TEntidade extends GenericEntity> {

	GenericRepository<TEntidade> getRepository();
	
	default Optional<TEntidade> findById(long id) throws Exception{
		if (!getRepository().existsById(id))
			throw new Exception("Não existe registro com este Id");
		return getRepository().findById(id);
	}

	default void deleteById(long id) {
		getRepository().deleteById(id);;
	}

	void save(TEntidade entidade);

	Page<TEntidade> findByNome(Pageable pageable, String nome);

	
	
}
