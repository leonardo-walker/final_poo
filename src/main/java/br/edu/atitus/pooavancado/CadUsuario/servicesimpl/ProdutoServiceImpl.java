package br.edu.atitus.pooavancado.CadUsuario.servicesimpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.CadUsuario.Entities.Produto;
import br.edu.atitus.pooavancado.CadUsuario.repositories.GenericRepository;
import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;
import br.edu.atitus.pooavancado.CadUsuario.services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	final ProdutoRepository produtoRepository;
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	@Override
	public GenericRepository<Produto> getRepository() {
		return produtoRepository;
	}

	@Override
	public void save(Produto entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Produto> findByNome(Pageable pageable, String nome) {
		// TODO Auto-generated method stub
		return null;
	}


}
