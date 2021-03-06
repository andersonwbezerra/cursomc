package com.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.repositories.PedidoRepository;
import com.cursomc.resources.domain.Pedido;
import com.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: "+id
					+ ", Tipo: "+ Pedido.class.getName());
		}
		return obj;
	}
	
}
