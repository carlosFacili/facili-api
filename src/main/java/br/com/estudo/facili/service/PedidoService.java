package br.com.estudo.facili.service;

import br.com.estudo.facili.dto.PedidoRequest;
import br.com.estudo.facili.entity.Pedido;
import br.com.estudo.facili.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public void criaPedido(PedidoRequest pedido) {

        Pedido entidade = PedidoRequest.converteParaEntidade(pedido);
        this.pedidoRepository.save(entidade);
    }

    public List listaTodosPedidos() {
        return this.pedidoRepository.findAll();
    } 
}
