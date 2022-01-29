package br.com.lucas.domain.repository;

import br.com.lucas.domain.entity.Cliente;
import br.com.lucas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
