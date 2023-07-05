package br.edu.atitus.pooavancado.CadUsuario.servicesimpl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.CadUsuario.Entities.Pedido;
import br.edu.atitus.pooavancado.CadUsuario.repositories.PedidoRepository;
import br.edu.atitus.pooavancado.CadUsuario.services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	final PedidoRepository pedidoRepository;
	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		super();
		this.pedidoRepository = pedidoRepository;
	}
	
	@Override
	public PedidoRepository getRepository() {
		return pedidoRepository;
	}

	@Override
	public void save(Pedido entidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Pedido> findByNome(Pageable pageable, String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
