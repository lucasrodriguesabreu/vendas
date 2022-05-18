package br.com.lucas.service;

import br.com.lucas.domain.entity.Pedido;
import br.com.lucas.rest.dto.PedidoDTO;
import org.springframework.stereotype.Service;

@Service
public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
}
