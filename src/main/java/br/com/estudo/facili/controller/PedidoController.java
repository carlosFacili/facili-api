package br.com.estudo.facili.controller;

import br.com.estudo.facili.dto.PedidoRequest;
import br.com.estudo.facili.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/pedidos")
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public void criarPedido(@RequestBody PedidoRequest pedido) {
        System.out.println(pedido.getProduto());
        this.pedidoService.criaPedido(pedido);
    }

    @GetMapping
    public List listarPedidos() {
        return this.pedidoService.listaTodosPedidos();
    }
}
