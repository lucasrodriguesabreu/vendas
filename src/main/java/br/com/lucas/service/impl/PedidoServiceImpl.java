package br.com.lucas.service.impl;

import br.com.lucas.domain.repository.ItensPedido;
import br.com.lucas.domain.repository.Pedidos;
import br.com.lucas.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    private ItensPedido itens;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }

}
