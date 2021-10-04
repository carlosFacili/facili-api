package br.com.estudo.facili.repository;

import br.com.estudo.facili.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
