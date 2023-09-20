package br.com.fiap.FunkoShop.repository;

import br.com.fiap.FunkoShop.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}