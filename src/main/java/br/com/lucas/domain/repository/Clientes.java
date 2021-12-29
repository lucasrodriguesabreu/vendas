package br.com.lucas.domain.repository;

import br.com.lucas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Object> findByNomeLike(String nome);
}
