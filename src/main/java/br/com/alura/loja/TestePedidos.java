package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.LogPedido;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args){

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(), new EnviarEmail(), new LogPedido()));
        geraPedidoHandler.execute(gerador);

    }

}
