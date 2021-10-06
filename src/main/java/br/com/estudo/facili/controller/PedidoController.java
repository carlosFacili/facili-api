package br.com.estudo.facili.controller;

import br.com.estudo.facili.dto.PedidoRequest;
import br.com.estudo.facili.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public void criarPedido(@RequestBody PedidoRequest pedido) {
        System.out.println(pedido.getProduto());
        this.pedidoService.criaPedido(pedido);
    }
}
