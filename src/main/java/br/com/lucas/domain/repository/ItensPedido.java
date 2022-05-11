package br.com.lucas.domain.repository;

import br.com.lucas.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItensPedido, Integer> {
}
