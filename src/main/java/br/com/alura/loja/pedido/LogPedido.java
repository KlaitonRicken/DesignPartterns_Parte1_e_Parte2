package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class LogPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Log");
    }
}
