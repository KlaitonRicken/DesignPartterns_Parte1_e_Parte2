package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComCincoItens extends Desconto{

    public DescontoComCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getQuantidadeDeItens() > 5);
    }

}
